package net.mcreator.modrunamia.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.modrunamia.ModRunamiaModElements;

import java.util.Map;

@ModRunamiaModElements.ModElement.Tag
public class ArcRainbowLorsqueLobjetADistanceEstUtiliseProcedure extends ModRunamiaModElements.ModElement {
	public ArcRainbowLorsqueLobjetADistanceEstUtiliseProcedure(ModRunamiaModElements instance) {
		super(instance, 28);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ArcRainbowLorsqueLobjetADistanceEstUtilise!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				System.err.println("Failed to load dependency itemstack for procedure ArcRainbowLorsqueLobjetADistanceEstUtilise!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 5);
	}
}
