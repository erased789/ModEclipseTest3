package com.kinpai.steampunk.init;

import com.kinpai.steampunk.Main;
import com.kinpai.steampunk.entity.EntityKaldoc;
import com.kinpai.steampunk.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntity 
{
	public static void registerEntities()
	{
		registerEntity("kaldoc", EntityKaldoc.class, Reference.ENTITY_KALDOC, 50, 15102720, 000000);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
