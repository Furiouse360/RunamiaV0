
package net.mcreator.modrunamia.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.modrunamia.item.ThunderHaxItem;
import net.mcreator.modrunamia.ModRunamiaModElements;

@ModRunamiaModElements.ModElement.Tag
public class RunamiaToolsItemGroup extends ModRunamiaModElements.ModElement {
	public RunamiaToolsItemGroup(ModRunamiaModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabrunamia_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ThunderHaxItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
