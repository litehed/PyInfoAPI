package pybot.main;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import pybot.proxies.IProxy;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, clientSideOnly=true)
public class Version {

	@Instance
	public static Version instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS)
	public static IProxy proxy;
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		
    }
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		proxy.init(event);
		MinecraftForge.EVENT_BUS.register(new ModEventHandler());
    }
	@EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
		
    }
}
