package muchahawlucha.necromancymod.client.render;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import muchahawlucha.necromancymod.common.entity.EntityNecromancer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelWitch;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

public class RenderNecromancer extends RenderLiving<EntityNecromancer> {

    private ResourceLocation necromancerTexture = new ResourceLocation("necromancymod:textures/entity/necromancer.png");
    public static final NMRenderFactory FACTORY = new NMRenderFactory();

    public RenderNecromancer(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityNecromancer entity) {
        return necromancerTexture;
    }

    public static class NMRenderFactory implements IRenderFactory<EntityNecromancer> {

        @Override
        public Render<? super EntityNecromancer> createRenderFor(RenderManager manager) {
            return new RenderNecromancer(manager, new ModelWitch(1.5F), 1.0F);
        }
    }
}


