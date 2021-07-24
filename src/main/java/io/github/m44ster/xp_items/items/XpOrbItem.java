package io.github.m44ster.xp_items.items;

import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ExperienceBottleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class XpOrbItem extends ExperienceBottleItem {
    int amount;


    public XpOrbItem(Item.Settings settings, int amount) {
        super(settings);
        this.amount = amount;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if (!world.isClient) {
            ExperienceOrbEntity experienceOrbEntity = new ExperienceOrbEntity(world, user.getX(), user.getY(), user.getZ(),amount);
            world.spawnEntity(experienceOrbEntity);
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}
