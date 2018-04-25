package com.kinpai.steampunk.entity;

//import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;


public class EntityKaldoc extends EntityCreeper
{

	public EntityKaldoc(World worldIn)
	{
		super(worldIn);
	}
	
	
	public EntityKaldoc createChild(EntityAgeable ageable)
	{
		return new EntityKaldoc(world);
	}
	
	@Override
	protected SoundEvent getAmbientSound() 
	{
		// TODO Auto-generated method stub
		return super.getAmbientSound();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source)
	{
		// TODO Auto-generated method stub
		return super.getHurtSound(source);
	}
	
	@Override
	protected SoundEvent getDeathSound() 
	{
		// TODO Auto-generated method stub
		return super.getDeathSound();
	}

	
}
