package com.kinpai.steampunk.init;

import java.util.ArrayList;
import java.util.List;

//import com.kinpai.steampunk.armour.ArmourBase;
import com.kinpai.steampunk.items.ItemBase;
import com.kinpai.steampunk.tools.ToolAxe;
import com.kinpai.steampunk.tools.ToolHoe;
import com.kinpai.steampunk.tools.ToolPickaxe;
import com.kinpai.steampunk.tools.ToolShovel;
import com.kinpai.steampunk.tools.ToolSword;
import com.kinpai.steampunk.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
//import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 190, 5, 1.2F, 5);
	//public static final ArmorMaterial ARMOUR_COPPER = EnumHelper.addArmorMaterial("armour_copper", Reference.MOD_ID + ":copper", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//Items
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item WRENCH = new ItemBase("wrench");
	public static final Item STEAM = new ItemBase("steam");
	
	//Tools
	public static final Item COPPER_AXE = new ToolAxe("copper_axe", TOOL_COPPER);
	public static final Item COPPER_HOE = new ToolHoe("copper_hoe", TOOL_COPPER);
	public static final Item COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", TOOL_COPPER);
	public static final Item COPPER_SHOVEL = new ToolShovel("copper_shovel", TOOL_COPPER);
	public static final Item COPPER_SWORD = new ToolSword("copper_sword", TOOL_COPPER);
	
	
	//Armour
	//public static final Item COPPER_HELMET = new ArmourBase("copper_helmet", ARMOUR_COPPER, 1, EntityEquipmentSlot.HEAD);
	//public static final Item COPPER_CHESTPLATE = new ArmourBase("copper_chestplate", ARMOUR_COPPER, 1, EntityEquipmentSlot.CHEST);
	//public static final Item COPPER_LEGGINGS = new ArmourBase("copper_leggings", ARMOUR_COPPER, 2, EntityEquipmentSlot.LEGS);
	//public static final Item COPPER_BOOTS = new ArmourBase("copper_boots", ARMOUR_COPPER, 1, EntityEquipmentSlot.FEET);
}
