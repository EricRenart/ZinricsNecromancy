package muchahawlucha.necromancymod.common.entity;

import muchahawlucha.necromancymod.NecromancyMod;
import muchahawlucha.necromancymod.client.render.RenderNecromancer;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

    private static int currEntityID = 1;

    public static void init() {
        EntityRegistry.registerModEntity(new ResourceLocation(NecromancyMod.MODID, "entities/necromancer"), EntityNecromancer.class,
                "Necromancer", currEntityID++, NecromancyMod.instance, 64, 3, true, 0xd8043c, 0x2b2b2b);
        EntityRegistry.addSpawn(EntityNecromancer.class, 100, 5, 10, EnumCreatureType.MONSTER,
                Biomes.ROOFED_FOREST, Biomes.SWAMPLAND);
        LootTableList.register(EntityNecromancer.LOOT);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityNecromancer.class, RenderNecromancer.FACTORY);
    }

}
