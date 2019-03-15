package muchahawlucha.necromancymod.common.world;

import muchahawlucha.necromancymod.common.block.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if(world.provider.getDimension() == 0) {
            // Onyx Ore generates in overworld only.
            generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateOre(ModBlocks.onyxOre.getDefaultState(), world, random, 16*chunkX, 16*chunkZ, 1, 32, 1 + random.nextInt(2), 4);
    }

    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int yMin, int yMax, int size, int chances) {
        int dY = yMax - yMin;
        for(int i = 0; i < chances; i++) {
            int randX = x + random.nextInt(16);
            int randY = yMin + random.nextInt(dY);
            int randZ = z + random.nextInt(16);
            BlockPos pos = new BlockPos(randX, randY, randZ);
            WorldGenMinable gen = new WorldGenMinable(ore, size);
            gen.generate(world, random, pos);
        }
    }
}
