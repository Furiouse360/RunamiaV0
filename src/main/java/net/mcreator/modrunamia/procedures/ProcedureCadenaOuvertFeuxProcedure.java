package net.mcreator.modrunamia.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.modrunamia.ModRunamiaModVariables;
import net.mcreator.modrunamia.ModRunamiaModElements;

import java.util.Map;

@ModRunamiaModElements.ModElement.Tag
public class ProcedureCadenaOuvertFeuxProcedure extends ModRunamiaModElements.ModElement {
	public ProcedureCadenaOuvertFeuxProcedure(ModRunamiaModElements instance) {
		super(instance, 47);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ProcedureCadenaOuvertFeux!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return (((entity.getCapability(ModRunamiaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ModRunamiaModVariables.PlayerVariables())).SortDeFeux) == (true));
	}
}
