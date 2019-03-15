package muchahawlucha.necromancymod.common.item;

import muchahawlucha.necromancymod.NecromancyMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemNecromancersStaff extends Item {

    // someday i'll make a factory class for stuff like this

    public ItemNecromancersStaff() {
        setRegistryName("necromancersstaff");
        setUnlocalizedName(NecromancyMod.MODID + ".necromancersstaff");
        setCreativeTab(CreativeTabs.MISC);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
