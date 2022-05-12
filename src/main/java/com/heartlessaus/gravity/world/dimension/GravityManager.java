package com.heartlessaus.gravity.world.dimension;

import com.heartlessaus.gravity.config.ModConfigs;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GravityManager {
    public static double getGravityMultiplier(World world) {
        //Currently static set in code, to be done via JSON
        if (world.getRegistryKey() == World.END) {
            return ModConfigs.gravityEnd;
        }
        if (world.getRegistryKey() == World.NETHER) {
            return ModConfigs.gravityNether;
        }
        if (world.getRegistryKey() == World.OVERWORLD) {
            return ModConfigs.gravityOverworld;
        }
        return 1.0d;
    }
}
