
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.minetrio1256.backrooms.init;

import net.minetrio1256.backrooms.BackroomsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class BackroomsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BackroomsMod.MODID);
	public static final RegistryObject<CreativeModeTab> BACKROOMS = REGISTRY.register("backrooms",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.backrooms.backrooms")).icon(() -> new ItemStack(BackroomsModBlocks.WALLSLEVEL_1.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BackroomsModBlocks.WALLSLEVEL_1.get().asItem());
				tabData.accept(BackroomsModBlocks.FLOOR_1.get().asItem());
				tabData.accept(BackroomsModBlocks.ROOF_1.get().asItem());
				tabData.accept(BackroomsModBlocks.LIGTH_1.get().asItem());
			})

					.build());
}
