package com.kinpai.steampunk.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCreeper - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelKaldoc extends ModelBase {
    public ModelRenderer KaldocBody;
    public ModelRenderer RightBackLeg;
    public ModelRenderer Right2ndBackLeg;
    public ModelRenderer Right2ndFrontLeft;
    public ModelRenderer RightFrontLeg;
    public ModelRenderer LeftBackLeg;
    public ModelRenderer Left2ndBackLeg;
    public ModelRenderer Left2ndFrontLeg;
    public ModelRenderer LeftFrontLeg;
    public ModelRenderer Head;

    public ModelKaldoc() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.RightFrontLeg = new ModelRenderer(this, 18, 0);
        this.RightFrontLeg.setRotationPoint(-4.0F, 15.0F, -1.0F);
        this.RightFrontLeg.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(RightFrontLeg, 0.0F, -0.7853981633974483F, -0.7853981633974483F);
        this.LeftBackLeg = new ModelRenderer(this, 18, 0);
        this.LeftBackLeg.setRotationPoint(4.0F, 15.0F, 2.0F);
        this.LeftBackLeg.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(LeftBackLeg, 0.0F, -0.7853981633974483F, 0.7853981633974483F);
        this.KaldocBody = new ModelRenderer(this, 16, 16);
        this.KaldocBody.setRotationPoint(0.0F, 6.2F, 0.2F);
        this.KaldocBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.Left2ndBackLeg = new ModelRenderer(this, 18, 0);
        this.Left2ndBackLeg.setRotationPoint(4.0F, 15.0F, 1.0F);
        this.Left2ndBackLeg.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(Left2ndBackLeg, 0.0F, -0.39269908169872414F, 0.5811946409141118F);
        this.LeftFrontLeg = new ModelRenderer(this, 18, 0);
        this.LeftFrontLeg.setRotationPoint(4.0F, 15.0F, -1.0F);
        this.LeftFrontLeg.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(LeftFrontLeg, 0.0F, 0.7853981633974483F, 0.7853981633974483F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 8.2F, 1.7F);
        this.Head.addBox(-4.0F, -12.0F, -5.5F, 8, 10, 8, 0.0F);
        this.Right2ndFrontLeft = new ModelRenderer(this, 18, 0);
        this.Right2ndFrontLeft.setRotationPoint(-4.0F, 15.0F, 0.0F);
        this.Right2ndFrontLeft.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(Right2ndFrontLeft, 0.0F, -0.39269908169872414F, -0.5811946409141118F);
        this.Right2ndBackLeg = new ModelRenderer(this, 18, 0);
        this.Right2ndBackLeg.setRotationPoint(-4.0F, 15.0F, 1.0F);
        this.Right2ndBackLeg.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(Right2ndBackLeg, 0.0F, 0.39269908169872414F, -0.5811946409141118F);
        this.Left2ndFrontLeg = new ModelRenderer(this, 18, 0);
        this.Left2ndFrontLeg.setRotationPoint(4.0F, 15.0F, 0.0F);
        this.Left2ndFrontLeg.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(Left2ndFrontLeg, 0.0F, 0.39269908169872414F, 0.5811946409141118F);
        this.RightBackLeg = new ModelRenderer(this, 18, 0);
        this.RightBackLeg.setRotationPoint(-4.0F, 15.0F, 2.0F);
        this.RightBackLeg.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(RightBackLeg, 0.0F, 0.7853981633974483F, -0.7853981633974483F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.RightFrontLeg.render(f5);
        this.LeftBackLeg.render(f5);
        this.KaldocBody.render(f5);
        this.Left2ndBackLeg.render(f5);
        this.LeftFrontLeg.render(f5);
        this.Head.render(f5);
        this.Right2ndFrontLeft.render(f5);
        this.Right2ndBackLeg.render(f5);
        this.Left2ndFrontLeg.render(f5);
        this.RightBackLeg.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
