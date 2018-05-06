package com.kinpai.steampunk.world.gen;

import java.util.Random;

import com.kinpai.steampunk.blocks.ModOres;
import com.kinpai.steampunk.init.ModBlocks;
import com.kinpai.steampunk.util.handlers.EnumHandler;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import scala.annotation.varargs;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator ore_overworld_copper, ore_overworld_tin;
	
	public WorldGenCustomOres() 
	{
		ore_overworld_copper = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(ModOres.VARIANT,  EnumHandler.EnumType.COPPER), 10, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_tin = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(ModOres.VARIANT, EnumHandler.EnumType.TIN), 10, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 0:
			
			runGenerator(ore_overworld_copper, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_overworld_tin, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
		}
		
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
			
		}
	}
}
