package net.mcreator.modrunamia.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.modrunamia.ModRunamiaModElements;

import java.util.Map;

@ModRunamiaModElements.ModElement.Tag
public class ThunderStickLorsqueLobjetADistanceEstUtiliseProcedure extends ModRunamiaModElements.ModElement {
	public ThunderStickLorsqueLobjetADistanceEstUtiliseProcedure(ModRunamiaModElements instance) {
		super(instance, 18);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ThunderStickLorsqueLobjetADistanceEstUtilise!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				System.err.println("Failed to load dependency itemstack for procedure ThunderStickLorsqueLobjetADistanceEstUtilise!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 600);
	}
}
