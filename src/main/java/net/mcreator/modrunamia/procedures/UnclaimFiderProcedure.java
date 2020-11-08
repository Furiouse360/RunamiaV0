package net.mcreator.modrunamia.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.modrunamia.ModRunamiaModElements;

import java.util.Map;

@ModRunamiaModElements.ModElement.Tag
public class UnclaimFiderProcedure extends ModRunamiaModElements.ModElement {
	public UnclaimFiderProcedure(ModRunamiaModElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure UnclaimFider!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure UnclaimFider!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure UnclaimFider!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure UnclaimFider!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure UnclaimFider!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean dedectNord = false;
		double xx = 0;
		double yy = 0;
		double zz = 0;
		entity.getPersistentData().putDouble("Coffre", 0);
		zz = (double) (-62);
		for (int index0 = 0; index0 < (int) (60); index0++) {
			yy = (double) (-3);
			for (int index1 = 0; index1 < (int) (6); index1++) {
				xx = (double) (-15);
				for (int index2 = 0; index2 < (int) (30); index2++) {
					if (((world.getBlockState(new BlockPos((int) (x + (xx)), (int) (y + (yy)), (int) (z + (zz))))).getBlock() == Blocks.CHEST
							.getDefaultState().getBlock())) {
						entity.getPersistentData().putDouble("Coffre", ((entity.getPersistentData().getDouble("Coffre")) + 1));
					}
					xx = (double) ((xx) + 1);
				}
				yy = (double) ((yy) + 1);
			}
			zz = (double) ((zz) + 1);
		}
	}
}
