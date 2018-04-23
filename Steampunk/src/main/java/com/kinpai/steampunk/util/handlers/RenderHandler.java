package com.kinpai.steampunk.util.handlers;

import com.kinpai.steampunk.entity.EntityKaldoc;
import com.kinpai.steampunk.entity.render.RenderKaldoc;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityKaldoc.class, new IRenderFactory<EntityKaldoc>()
		{
			@Override
			public Render<? super EntityKaldoc> createRenderFor(RenderManager manager)
			{
				return new RenderKaldoc(manager);
			}
		});
	}
}
