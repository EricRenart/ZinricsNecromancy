package muchahawlucha.necromancymod.common.entity;

import muchahawlucha.necromancymod.NecromancyMod;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import javax.annotation.Nullable;

public class EntityNecromancer extends EntityWitch {

    public static final ResourceLocation LOOT = new ResourceLocation(NecromancyMod.MODID, "entities/necromancer");

    public EntityNecromancer(World worldIn) {
        super(worldIn);
        setSize(1.1f, 1.5f);

    }

    @Override
    protected void entityInit() {
        super.entityInit();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0d);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(4.0d);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0d);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();

    }


    @Override
    public int getMaxSpawnedInChunk() {
        return 1;
    }

    @Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
}
