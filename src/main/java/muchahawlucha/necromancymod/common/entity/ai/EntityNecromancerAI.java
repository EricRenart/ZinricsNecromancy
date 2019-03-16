package muchahawlucha.necromancymod.common.entity.ai;

import muchahawlucha.necromancymod.common.entity.EntityNecromancer;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIAttackRanged;

public class EntityNecromancerAI extends EntityAIAttackRanged {

    private EntityNecromancer necromancer;

    @Override
    public void resetTask() {
        super.resetTask();
    }

    @Override
    public void updateTask() {
        super.updateTask();
    }

    @Override
    public void startExecuting() {
        super.startExecuting();
    }

    public EntityNecromancerAI(IRangedAttackMob attacker, double movespeed, int maxAttackTime, float maxAttackDistanceIn) {
        super(attacker, movespeed, maxAttackTime, maxAttackDistanceIn);
    }
}
