package com.heartlessaus.gravity.world.dimension;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GravityManager {
    public static double getGravityMultiplier(World world) {
        if (world.getRegistryKey() == World.END) {
            return 0.165d;
        }
        return 1.0d;
    }
}
