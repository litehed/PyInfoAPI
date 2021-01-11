package pybot.main;

import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pybot.gathering.GathererUtil;
import pybot.gathering.UrlConnection;
import pybot.init.ModKeyBindings;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class ModEventHandler {
	int tick;
	boolean tryConnecting = true;
	static EntityPlayer player;
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void playerTickEvent(PlayerTickEvent event) {
		if(tryConnecting) {
			tick++;
			if(tick==10) {
				try {
					new UrlConnection("posX", GathererUtil.getPlayerX(event.player));
					new UrlConnection("posY", GathererUtil.getPlayerY(event.player));
					new UrlConnection("posZ", GathererUtil.getPlayerZ(event.player));
					tick=0;
				} catch (IOException e) {
					tick = 0;
					tryConnecting = false;
					e.printStackTrace();
					System.out.println("No Server Detected!");
				}
			}
		}
	}
	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public static void onEvent(KeyInputEvent event)
	{
		player = Minecraft.getMinecraft().player;
		if(ModKeyBindings.keyBindings.get(0).isPressed())
			System.out.println("beep boop");
	}
}
