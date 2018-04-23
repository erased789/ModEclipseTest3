package com.kinpai.steampunk.util.compat;

import com.kinpai.steampunk.init.ModBlocks;
import com.kinpai.steampunk.init.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat 
{
	public static void registerOres()
	{
		OreDictionary.registerOre("oreCopper", ModBlocks.COPPER_BLOCK);
		OreDictionary.registerOre("ingotCopper", ModItems.COPPER_INGOT);
		
	}

}
