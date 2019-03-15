package muchahawlucha.necromancymod.common.block;

import com.mojang.realmsclient.gui.ChatFormatting;
import muchahawlucha.necromancymod.NecromancyMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
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

public class BlockOnyxOre extends Block {
    public BlockOnyxOre() {
        super(Material.ROCK);
        this.setRegistryName("onyxore");
        this.setUnlocalizedName(NecromancyMod.MODID + ".onyxore");
        this.setCreativeTab(CreativeTabs.MATERIALS);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        stack.setStackDisplayName(ChatFormatting.LIGHT_PURPLE + new ItemStack(Item.getItemFromBlock(this)).getDisplayName());
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
                new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
