package muchahawlucha.necromancymod.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

@Mod.EventBusSubscriber
public class CommonProxy {

    // this is where most of the mod loading magic happens

    // config instance
    public static Configuration config;
    // filename of configuration file
    private static final String CONFIG_FILENAME = "zinricsnecromancy.cfg";

    public void preInit(FMLPreInitializationEvent e) {
        File dir = e.getModConfigurationDirectory();
        config = new Configuration(new File(dir.getPath(), CONFIG_FILENAME));
        Config.readConfig();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {
        if(config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) {

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {

    }
}
