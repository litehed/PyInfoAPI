package pybot.main;

import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import pybot.gathering.GathererUtil;
import pybot.gathering.UrlConnection;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class ModEventHandler {
	int tick;
	
	@SubscribeEvent
	public void onLivingUpdate(LivingUpdateEvent event) {
		if (event.getEntity() instanceof EntityPlayer)
		{
//			try {
//				new UrlConnection("posX", GathererUtil.getPlayerX((EntityPlayer) event.getEntity()));
//				new UrlConnection("posY", GathererUtil.getPlayerY((EntityPlayer) event.getEntity()));
//				new UrlConnection("posZ", GathererUtil.getPlayerZ((EntityPlayer) event.getEntity()));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
	}
	@SubscribeEvent
	public void playerTickEvent(PlayerTickEvent event) {
		tick++;
		if(tick==10) {
			try {
				new UrlConnection("posX", GathererUtil.getPlayerX(event.player));
				new UrlConnection("posY", GathererUtil.getPlayerY(event.player));
				new UrlConnection("posZ", GathererUtil.getPlayerZ(event.player));
				tick=0;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
