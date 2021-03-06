package net.mcreator.modrunamia.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.modrunamia.ModRunamiaModElements;

import java.util.Map;

@ModRunamiaModElements.ModElement.Tag
public class ThunderSwordLorsqueLoutilEstDansLaMainProcedure extends ModRunamiaModElements.ModElement {
	public ThunderSwordLorsqueLoutilEstDansLaMainProcedure(ModRunamiaModElements instance) {
		super(instance, 32);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ThunderSwordLorsqueLoutilEstDansLaMain!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 1));
	}
}
