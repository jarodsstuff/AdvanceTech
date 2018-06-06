package mcadventurecity.advancetech;

import mcadventurecity.advancetech.util.CommonProxy;
import mcadventurecity.advancetech.util.Constants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION, dependencies = "required-after:advancebase")
public class AdvanceTech {

    	@SidedProxy(clientSide = "mcadventurecity.advancetech.util.ClientProxy", serverSide = "mcadventurecity.advancetech.util.ServerProxy")
    	public static CommonProxy proxy;
    	@Mod.Instance
    	public static AdvanceTech instance;
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {
	    	
	    }

	    @EventHandler
	    public void init(FMLInitializationEvent event)
	    {
	    	
	    }
	    @EventHandler
	    public void postInit(FMLPostInitializationEvent event)
	    {
	    	
	    }
}
