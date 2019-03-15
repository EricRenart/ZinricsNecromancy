package muchahawlucha.necromancymod.client;

import muchahawlucha.necromancymod.NecromancyMod;
import muchahawlucha.necromancymod.common.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NecromancyTab extends CreativeTabs {

    public NecromancyTab() {
        super(NecromancyMod.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.necromancersStaff);
    }
}
