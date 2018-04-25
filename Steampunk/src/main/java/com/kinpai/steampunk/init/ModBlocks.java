package com.kinpai.steampunk.init;

import java.util.ArrayList;
import java.util.List;

import com.kinpai.steampunk.blocks.BlockBase;
import com.kinpai.steampunk.blocks.CopperBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
	public static final Block STEAM_BLOCK = new BlockBase("steam_block", Material.IRON);
	public static final Block FURNACE = new BlockBase("furnace", Material.IRON);
}
