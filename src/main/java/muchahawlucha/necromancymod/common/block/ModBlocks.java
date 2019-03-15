package muchahawlucha.necromancymod.common.block;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
    // Onyx Ore
    @GameRegistry.ObjectHolder("necromancymod:onyxore")
    public static BlockOnyxOre onyxOre;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        onyxOre.initModel();
    }
}
