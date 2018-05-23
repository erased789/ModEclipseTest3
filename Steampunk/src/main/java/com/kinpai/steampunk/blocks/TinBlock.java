package com.kinpai.steampunk.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TinBlock extends BlockBase
{

	public TinBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(1.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 1);
		//setLightLevel(1.0f);
		//setLightOpacity();
		//setBlockUnbreakable();
		
	}
	
	
}
