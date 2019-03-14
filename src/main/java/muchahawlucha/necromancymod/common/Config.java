package muchahawlucha.necromancymod.common;


import muchahawlucha.necromancymod.NecromancyMod;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class Config {

    private static final String CATEGORY_GENERAL = "general";

    // Config descriptions go here.
    private static final String TEST_CONFIG_LABEL = "Test Boolean Config Option";

    // Config values go here.
    public static boolean testConfigBoolean = false;

    public static void readConfig() {
        Configuration c = CommonProxy.config;
        try {
            c.load();
            initGeneralConfig(c);
        }
        catch (Exception ex) {
            NecromancyMod.logger.log(Level.ERROR,"Error loading "+NecromancyMod.MODID+" config file");
        }
        finally {
            if(c.hasChanged()) {
                c.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration config){
        config.addCustomCategoryComment(CATEGORY_GENERAL, "General Configuration");
        testConfigBoolean = config.getBoolean("testBoolean", CATEGORY_GENERAL, testConfigBoolean, TEST_CONFIG_LABEL);

    }
}
