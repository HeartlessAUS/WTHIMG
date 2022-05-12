package com.heartlessaus.gravity.config;
import com.heartlessaus.gravity.gravity;
import com.mojang.datafixers.util.Pair;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static double gravityOverworld;
    public static double gravityNether;
    public static double gravityEnd;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(gravity.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }


    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("gravity.overworld", 1.0d), "double");
        configs.addKeyValuePair(new Pair<>("gravity.nether", 1.050d), "double");
        configs.addKeyValuePair(new Pair<>("gravity.end", 0.165d), "double");
    }

    private static void assignConfigs() {
        gravityOverworld = CONFIG.getOrDefault("gravity.overworld", 1.0d);
        System.out.println(gravity.MOD_ID + ": Overworld gravity set to " + gravityOverworld);
        gravityNether = CONFIG.getOrDefault("gravity.nether", 1.050d);
        System.out.println(gravity.MOD_ID + ": Nether gravity set to " + gravityNether);
        gravityEnd = CONFIG.getOrDefault("gravity.end", 0.165d);
        System.out.println(gravity.MOD_ID + ": End gravity set to " + gravityEnd);
    }
}
