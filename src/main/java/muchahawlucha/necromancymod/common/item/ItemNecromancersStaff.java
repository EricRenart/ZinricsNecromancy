package muchahawlucha.necromancymod.common.item;

import com.mojang.realmsclient.gui.ChatFormatting;
import muchahawlucha.necromancymod.NecromancyMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.BossInfo;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.awt.*;
import java.util.List;

public class ItemNecromancersStaff extends Item {

    // someday i'll make a factory class for stuff like this

    public ItemNecromancersStaff() {
        setRegistryName("necromancersstaff");
        setUnlocalizedName(NecromancyMod.MODID + ".necromancersstaff");
        setCreativeTab(CreativeTabs.MISC);
    }


    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        stack.setStackDisplayName(ChatFormatting.DARK_PURPLE + getItemStackDisplayName(new ItemStack(this)));
        tooltip.add("The staff of a powerful Necromancer");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
