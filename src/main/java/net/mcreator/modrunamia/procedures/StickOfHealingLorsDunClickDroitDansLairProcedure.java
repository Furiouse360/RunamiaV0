package net.mcreator.modrunamia.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.modrunamia.ModRunamiaModElements;

import java.util.Random;
import java.util.Map;

@ModRunamiaModElements.ModElement.Tag
public class StickOfHealingLorsDunClickDroitDansLairProcedure extends ModRunamiaModElements.ModElement {
	public StickOfHealingLorsDunClickDroitDansLairProcedure(ModRunamiaModElements instance) {
		super(instance, 19);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure StickOfHealingLorsDunClickDroitDansLair!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				System.err.println("Failed to load dependency itemstack for procedure StickOfHealingLorsDunClickDroitDansLair!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) + 8));
		{
			ItemStack _ist = (itemstack);
			if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamage(0);
			}
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 250);
	}
}
