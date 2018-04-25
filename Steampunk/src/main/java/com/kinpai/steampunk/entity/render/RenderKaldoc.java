package com.kinpai.steampunk.entity.render;

import com.kinpai.steampunk.entity.EntityKaldoc;
import com.kinpai.steampunk.entity.model.ModelKaldoc;
import com.kinpai.steampunk.util.Reference;

//import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKaldoc extends RenderLiving<EntityKaldoc>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/kaldoc.png");
	
	public RenderKaldoc(RenderManager manager)
	{
		super(manager, new ModelKaldoc(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityKaldoc entity) 
	{
		
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityKaldoc entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
