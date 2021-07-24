package io.github.m44ster.xp_items;

import io.github.m44ster.xp_items.items.XpOrbItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class XpItems implements ModInitializer {
	public static final XpOrbItem XP_ORB = new XpOrbItem(new FabricItemSettings().group(ItemGroup.MISC),1);
	public static final XpOrbItem COMPRESSED_XP_ORB = new XpOrbItem(new FabricItemSettings().group(ItemGroup.MISC),9);
	public static final XpOrbItem DOUBLE_COMPRESSED_XP_ORB = new XpOrbItem(new FabricItemSettings().group(ItemGroup.MISC),81);
	public static final XpOrbItem TRIPLE_COMPRESSED_XP_ORB = new XpOrbItem(new FabricItemSettings().group(ItemGroup.MISC),729);
	public static final XpOrbItem QUADRUPLE_COMPRESSED_XP_ORB = new XpOrbItem(new FabricItemSettings().group(ItemGroup.MISC),6561);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.ITEM, new Identifier("xp_items", "xp_orb"), XP_ORB);
		Registry.register(Registry.ITEM, new Identifier("xp_items", "compressed_xp_orb"), COMPRESSED_XP_ORB);
		Registry.register(Registry.ITEM, new Identifier("xp_items", "double_compressed_xp_orb"), DOUBLE_COMPRESSED_XP_ORB);
		Registry.register(Registry.ITEM, new Identifier("xp_items", "triple_compressed_xp_orb"), TRIPLE_COMPRESSED_XP_ORB);
		Registry.register(Registry.ITEM, new Identifier("xp_items", "quadruple_compressed_xp_orb"), QUADRUPLE_COMPRESSED_XP_ORB);

	}
}
