package muchahawlucha.necromancymod.common.item;

import com.mojang.realmsclient.gui.ChatFormatting;
import muchahawlucha.necromancymod.NecromancyMod;
import muchahawlucha.necromancymod.client.NecromancyTab;
import muchahawlucha.necromancymod.common.soul.EnumSoulType;
import muchahawlucha.necromancymod.common.soul.Soul;
import muchahawlucha.necromancymod.proxy.ClientProxy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Level;

import javax.annotation.Nullable;
import java.util.List;

public class ItemSoulGemBase extends Item {

    // The Soul that this Soul Gem is currently holding
    Soul currentSoul;

    public ItemSoulGemBase() {
        currentSoul = new Soul();
        setRegistryName("soulgem");
        setUnlocalizedName(NecromancyMod.MODID + ".soulgem");
        setCreativeTab(ClientProxy.creativeTab);
    }

    public ItemSoulGemBase(EnumSoulType initSoul) {
        currentSoul = new Soul(initSoul);
        setRegistryName("soulgem");
        setUnlocalizedName(NecromancyMod.MODID + ".soulgem");
        setCreativeTab(ClientProxy.creativeTab);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        stack.setStackDisplayName(ChatFormatting.AQUA + getItemStackDisplayName(new ItemStack(this)));
        String soulTooltip;
        if(currentSoul.getType() == null) {
            soulTooltip = "NULL";
            NecromancyMod.logger.log(Level.ERROR, "Soul type is null for this gem");
        }
        else {
            soulTooltip = "Soul: " + currentSoul.getSoulName();
        }
        tooltip.add(soulTooltip);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
