package muchahawlucha.necromancymod.common.item;

import com.mojang.realmsclient.gui.ChatFormatting;
import muchahawlucha.necromancymod.NecromancyMod;
import muchahawlucha.necromancymod.common.soul.EnumSoulType;
import muchahawlucha.necromancymod.common.soul.Soul;
import muchahawlucha.necromancymod.proxy.ClientProxy;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.apache.logging.log4j.Level;

import javax.annotation.Nullable;
import java.util.List;

public class ItemSoulGemFilled extends ItemSoulGemBase {

    public ItemSoulGemFilled(EnumSoulType initSoul) {
        super();
        currentSoul = new Soul(initSoul);
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return getContentsDisplayName() + " Soul Gem";
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        stack.setStackDisplayName(ChatFormatting.AQUA + getItemStackDisplayName(new ItemStack(this)));
        String soulTooltip;
        if (currentSoul.getType() == null) {
            soulTooltip = "NULL";
            NecromancyMod.logger.log(Level.ERROR, "Soul type is null for this gem");
        } else {
            soulTooltip = "Soul: " + currentSoul.getSoulDisplayName();
        }
        tooltip.add(soulTooltip);
    }

    // Convenience methods
    public Soul getContents() {
        return currentSoul;
    }

    public EnumSoulType getContentsType() {
        return currentSoul.getType();
    }

    public String getContentsDisplayName() {
        return currentSoul.getSoulDisplayName();
    }

    public String getContentsName() {
        return currentSoul.getSoulName();
    }

    public void setContents(Soul s) {
        currentSoul = s;
    }

}
