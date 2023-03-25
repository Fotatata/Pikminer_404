package com.fotatata.pikminer404.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

public class RedPikmin extends AbstractPikmin implements IAnimatable {

    private AnimationFactory factory = GeckoLibUtil.createFactory(this);

    public RedPikmin(EntityType<? extends AgeableMob> p_146738_, Level p_146739_) {
        super(p_146738_, p_146739_);
    }

    public static AttributeSupplier setAttributes () {
        return AbstractPikmin.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 10.00)
                .add(Attributes.MOVEMENT_SPEED, 5.0f)
                .add(Attributes.ATTACK_SPEED, 1.5f)
                .add(Attributes.ATTACK_DAMAGE, 1.0f).build();
    }

    @Override
    public boolean fireImmune() {
        return true;
    }

    @Nullable
    @Override
    public RedPikmin getBreedOffspring(@Nullable ServerLevel p_146743_, @Nullable AgeableMob p_146744_) {
        return null;
    }

    private <E extends IAnimatable>PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()){
            event.getController().setAnimation(new AnimationBuilder().addAnimation("move", ILoopType.EDefaultLoopTypes.LOOP));
            return PlayState.CONTINUE;
        }
        //This wont work it needs to be synched to server and client.
        if (isAttacking){
            event.getController().setAnimation(new AnimationBuilder().addAnimation("attack", ILoopType.EDefaultLoopTypes.LOOP));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", ILoopType.EDefaultLoopTypes.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
}
