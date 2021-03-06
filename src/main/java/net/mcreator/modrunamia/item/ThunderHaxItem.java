
package net.mcreator.modrunamia.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.modrunamia.itemgroup.RunamiaToolsItemGroup;
import net.mcreator.modrunamia.ModRunamiaModElements;

@ModRunamiaModElements.ModElement.Tag
public class ThunderHaxItem extends ModRunamiaModElements.ModElement {
	@ObjectHolder("mod_runamia:thunder_hax")
	public static final Item block = null;
	public ThunderHaxItem(ModRunamiaModElements instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
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
		}, 1, -3f, new Item.Properties().group(RunamiaToolsItemGroup.tab)) {
		}.setRegistryName("thunder_hax"));
	}
}
