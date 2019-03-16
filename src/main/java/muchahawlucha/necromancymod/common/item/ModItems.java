package muchahawlucha.necromancymod.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    // Nceromancers Staff
    @GameRegistry.ObjectHolder("necromancymod:necromancersstaff")
    public static ItemNecromancersStaff necromancersStaff;

    // Onyx Gem
    @GameRegistry.ObjectHolder("necromancymod:onyxgem")
    public static ItemOnyxGem onyxGem;

    // Basic Soul Gem
    @GameRegistry.ObjectHolder("necromancymod:soulgem")
    public static ItemSoulGemBase soulGem;

    // Filled Soul Gem
    @GameRegistry.ObjectHolder("necromancymod:soulgemfilled")
    public static ItemSoulGemFilled soulGemFilled;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        necromancersStaff.initModel();
        onyxGem.initModel();
        soulGem.initModel();
        soulGemFilled.initModel();
    }

}
