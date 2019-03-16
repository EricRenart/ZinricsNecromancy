package muchahawlucha.necromancymod.common.block;

import com.mojang.realmsclient.gui.ChatFormatting;
import muchahawlucha.necromancymod.NecromancyMod;
import muchahawlucha.necromancymod.common.item.ItemOnyxGem;
import muchahawlucha.necromancymod.common.item.ModItems;
import muchahawlucha.necromancymod.proxy.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class BlockOnyxOre extends Block {

    ItemOnyxGem drop;

    public BlockOnyxOre() {
        super(Material.ROCK);
        drop = new ItemOnyxGem();
        this.setRegistryName("onyxore");
        this.setUnlocalizedName(NecromancyMod.MODID + ".onyxore");
        this.setCreativeTab(ClientProxy.creativeTab);
    }

    @Override
    public int quantityDropped(Random random) {
        return 1 + random.nextInt(2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return drop == null ? Item.getItemFromBlock(this) : drop;
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        return 1 + fortune + random.nextInt(2);
    }


    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
                new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
