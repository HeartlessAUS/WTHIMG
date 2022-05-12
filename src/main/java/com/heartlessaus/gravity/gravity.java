package com.heartlessaus.gravity;

import net.fabricmc.api.ModInitializer;

import com.heartlessaus.gravity.config.ModConfigs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class gravity implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "WTHIMG";


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModConfigs.registerConfigs();
		System.out.println(MOD_ID + ": Where the hell is my damn Gravity!!");
	}
}
