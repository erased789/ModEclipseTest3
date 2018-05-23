package com.kinpai.steampunk.init;

import java.util.ArrayList;
import java.util.List;

import com.kinpai.steampunk.blocks.BlockBase;
import com.kinpai.steampunk.blocks.BronzeBlock;
import com.kinpai.steampunk.blocks.CopperBlock;
import com.kinpai.steampunk.blocks.ModOres;
import com.kinpai.steampunk.blocks.TinBlock;
import com.kinpai.steampunk.blocks.machines.stmpfurnace.BlockSteampunkFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
	public static final Block STEAM_BLOCK = new BlockBase("steam_block", Material.IRON);
	public static final Block BARREL = new BlockBase("barrel", Material.WOOD);
	public static final Block STEAMPUNK_FURNACE = new BlockSteampunkFurnace("steampunk_furnace");
	public static final Block BRONZE_BLOCK = new BronzeBlock("bronze_block", Material.IRON);
	public static final Block TIN_BLOCK = new TinBlock("tin_block", Material.IRON);
	
	//Ores
	public static final Block COPPER_ORE_SMELTABLE = new BlockBase("copper_ore_smeltable", Material.ROCK);
	public static final Block TIN_ORE_SMELTABLE = new BlockBase("tin_ore_smeltable", Material.ROCK);
	
	
	public static final Block ORE_END = new ModOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new ModOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new ModOres("ore_nether", "nether");
}
