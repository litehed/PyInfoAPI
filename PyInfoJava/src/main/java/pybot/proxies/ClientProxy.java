package pybot.proxies;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import pybot.init.ModKeyBindings;

public class ClientProxy implements IProxy{

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FMLInitializationEvent event) {
		ModKeyBindings.registerKeyBindings();
		
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		// TODO Auto-generated method stub
		
	}

}
