package muchahawlucha.necromancymod.common;

import muchahawlucha.necromancymod.common.block.BlockOnyxOre;
import muchahawlucha.necromancymod.common.block.ModBlocks;
import muchahawlucha.necromancymod.common.item.ItemNecromancersStaff;
import muchahawlucha.necromancymod.common.item.ItemOnyxGem;
import muchahawlucha.necromancymod.common.world.ModWorldGen;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.io.File;

@Mod.EventBusSubscriber
public class CommonProxy {

    // this is where most of the mod loading magic happens

    // config instance
    public static Configuration config;
    // filename of configuration file
    private static final String CONFIG_FILENAME = "zinricsnecromancy.cfg";

    public void preInit(FMLPreInitializationEvent e) {
        // register ore generator
        GameRegistry.registerWorldGenerator(new ModWorldGen(),3);

        // init configs
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
        e.getRegistry().register(new BlockOnyxOre());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {
        //ItemBlocks
        e.getRegistry().register(new ItemBlock(ModBlocks.onyxOre).setRegistryName(ModBlocks.onyxOre.getRegistryName()));

        //Items
        e.getRegistry().register(new ItemNecromancersStaff());
        e.getRegistry().register(new ItemOnyxGem());
    }
}
