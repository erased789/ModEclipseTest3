package com.kinpai.steampunk.blocks.machines.stmpfurnace.slots;

import com.kinpai.steampunk.blocks.machines.stmpfurnace.TileEntitySteampunkFurnace;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotSteampunkFurnaceFuel extends Slot
{
	public SlotSteampunkFurnaceFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntitySteampunkFurnace.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return super.getItemStackLimit(stack);
	}
}
