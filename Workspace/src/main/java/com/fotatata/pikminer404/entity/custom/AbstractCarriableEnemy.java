package com.fotatata.pikminer404.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public abstract class AbstractCarriableEnemy extends Monster {

    protected int WEIGHT;
    protected int MAX_CARRY;
    protected int VALUE;
    protected int SEEDS;
    protected float ROCK_STRENGTH = 4.0f;
    protected boolean IS_DEAD = false;


    protected AbstractCarriableEnemy(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    protected abstract void Attack();

}
