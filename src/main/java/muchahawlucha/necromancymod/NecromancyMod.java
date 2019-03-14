package muchahawlucha.necromancymod;

import muchahawlucha.necromancymod.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

@Mod(modid = NecromancyMod.MODID, name = NecromancyMod.NAME, version = NecromancyMod.VERSION,
        dependencies = "required-after:forge@[14.23.5.2768,)", useMetadata = true)
public class NecromancyMod
{
    public static final String MODID = "necromancymod";
    public static final String NAME = "Zinric's Necromancy";
    public static final String VERSION = "0.1";

    // proxy
    @SidedProxy(clientSide = "muchahawlucha.necromancymod.proxy.ClientProxy", serverSide = "muchahawlucha.necromancymod.proxy.ServerProxy")
    public static CommonProxy proxy;

    // this mod's singleton instance
    @Mod.Instance
    public static NecromancyMod instance;

    public static Logger logger;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
        logger.log(Level.INFO, "Zinric's Necromancy Initialized");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
