package com.kinpai.steampunk.util.handlers;

import com.kinpai.steampunk.blocks.machines.stmpfurnace.TileEntitySteampunkFurnace;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntitySteampunkFurnace.class, "steampunkg_furnace");
	}
}
