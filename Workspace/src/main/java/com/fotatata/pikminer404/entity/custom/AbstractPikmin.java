package com.fotatata.pikminer404.entity.custom;

import net.minecraft.world.entity.*;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.List;

public abstract class AbstractPikmin extends AgeableMob {

    protected AbstractPikmin(EntityType<? extends AgeableMob> p_146738_, Level p_146739_) {
        super(p_146738_, p_146739_);
    }

    protected List<LivingEntity> enemyList;
    protected AABB boundingBox;
    protected float closestEnemy = 3.0f;
    protected LivingEntity target;
    protected boolean isAttacking = false;
    public String TYPE = "leaf";

    @SubscribeEvent
    protected void getClosestEnemy () {

        boundingBox = new AABB(this.blockPosition()).inflate(3);

        enemyList = level.getEntitiesOfClass(LivingEntity.class,boundingBox);
        for (LivingEntity entity : enemyList) {
            if (entity.distanceTo(this) < closestEnemy && entity instanceof Monster) {
                target = entity;
            }
        }
        attack(target);
    }

    protected void attack (LivingEntity enemy) {
        this.moveTo(enemy.getX(),enemy.getY(),enemy.getZ());
        if (this.getBoundingBox().intersects(enemy.getBoundingBox())){
            this.startRiding(enemy);
            this.doAutoAttackOnTouch(enemy);
            isAttacking = true;
        }
        else {
            isAttacking = false;
        }
    }
}
