package com.kinpai.steampunk.blocks.machines.stmpfurnace;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.kinpai.steampunk.init.ModBlocks;
import com.kinpai.steampunk.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

public class SteampunkFurnaceRecipes 
{
	private static final SteampunkFurnaceRecipes INSTANCE = new SteampunkFurnaceRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static SteampunkFurnaceRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private SteampunkFurnaceRecipes() 
	{
		addSteampunkRecipe(new ItemStack(Blocks.IRON_BLOCK), new ItemStack(Blocks.IRON_BLOCK), new ItemStack(ModBlocks.STEAMPUNK_FURNACE), 5.0F);
		addSteampunkRecipe(new ItemStack(ModBlocks.ORE_OVERWORLD), new ItemStack(ModBlocks.BARREL), new ItemStack(ModItems.COPPER_INGOT), 5.0F);

		addSteampunkRecipe(new ItemStack(ModBlocks.COPPER_ORE_SMELTABLE), new ItemStack(ModBlocks.BARREL), new ItemStack(ModItems.COPPER_INGOT), 5.0F);
		addSteampunkRecipe(new ItemStack(ModBlocks.TIN_ORE_SMELTABLE, 3), new ItemStack(ModBlocks.BARREL, 3), new ItemStack(ModItems.TIN_SWORD), 5.0F);
		

		addSteampunkRecipe(new ItemStack(ModBlocks.COPPER_ORE_SMELTABLE), new ItemStack(ModBlocks.COPPER_ORE_SMELTABLE), new ItemStack(ModItems.COPPER_INGOT, 2), 5.0F);
		addSteampunkRecipe(new ItemStack(ModBlocks.TIN_ORE_SMELTABLE), new ItemStack(ModBlocks.BARREL), new ItemStack(ModItems.TIN_SWORD), 5.0F);
		addSteampunkRecipe(new ItemStack(Blocks.IRON_ORE), new ItemStack(Blocks.IRON_ORE), new ItemStack(Items.IRON_INGOT, 2), 5.0F);
		addSteampunkRecipe(new ItemStack(Blocks.GOLD_ORE), new ItemStack(Blocks.GOLD_ORE), new ItemStack(Items.GOLD_INGOT, 2), 5.0F);
		addSteampunkRecipe(new ItemStack(ModItems.TIN_INGOT), new ItemStack(ModItems.COPPER_INGOT), new ItemStack(ModItems.BRONZE_INGOT, 2), 5.0F);
		//addSteampunkRecipe(new ItemStack(ModItems.COPPER_INGOT), new ItemStack(ModItems.TIN_INGOT), new ItemStack(ModItems.BRONZE_INGOT, 2), 5.0F);

	}

	
	public void addSteampunkRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getSteampunkResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getSteampunkResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getSteampunkExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}
