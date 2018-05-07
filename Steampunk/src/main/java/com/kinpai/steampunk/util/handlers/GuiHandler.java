package com.kinpai.steampunk.util.handlers;

import com.kinpai.steampunk.blocks.machines.stmpfurnace.ContainerSteampunkFurnace;
import com.kinpai.steampunk.blocks.machines.stmpfurnace.GuiSteampunkFurnace;
import com.kinpai.steampunk.blocks.machines.stmpfurnace.TileEntitySteampunkFurnace;
import com.kinpai.steampunk.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_STEAMPUNK_FURNACE) return new ContainerSteampunkFurnace(player.inventory, (TileEntitySteampunkFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_STEAMPUNK_FURNACE) return new GuiSteampunkFurnace(player.inventory, (TileEntitySteampunkFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
}
