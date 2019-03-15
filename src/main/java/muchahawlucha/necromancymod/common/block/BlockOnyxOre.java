package muchahawlucha.necromancymod.common.block;

import muchahawlucha.necromancymod.NecromancyMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOnyxOre extends Block {
    public BlockOnyxOre() {
        super(Material.ROCK);
        this.setRegistryName("onyxore");
        this.setUnlocalizedName(NecromancyMod.MODID + ".onyxore");
        this.setCreativeTab(CreativeTabs.MATERIALS);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
                new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
