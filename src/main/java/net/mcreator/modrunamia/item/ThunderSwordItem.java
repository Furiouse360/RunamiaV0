
package net.mcreator.modrunamia.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.Entity;

import net.mcreator.modrunamia.procedures.ThunderSwordLorsqueLoutilEstDansLaMainProcedure;
import net.mcreator.modrunamia.itemgroup.RunamiaToolsItemGroup;
import net.mcreator.modrunamia.ModRunamiaModElements;

import java.util.Map;
import java.util.HashMap;

@ModRunamiaModElements.ModElement.Tag
public class ThunderSwordItem extends ModRunamiaModElements.ModElement {
	@ObjectHolder("mod_runamia:thunder_sword")
	public static final Item block = null;
	public ThunderSwordItem(ModRunamiaModElements instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ThunderItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(RunamiaToolsItemGroup.tab)) {
			@Override
			public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
				super.inventoryTick(itemstack, world, entity, slot, selected);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				if (selected) {
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ThunderSwordLorsqueLoutilEstDansLaMainProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("thunder_sword"));
	}
}
