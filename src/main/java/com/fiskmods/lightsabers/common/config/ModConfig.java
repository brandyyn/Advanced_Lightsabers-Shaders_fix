package com.fiskmods.lightsabers.common.config;

import net.minecraftforge.common.config.Configuration;

public class ModConfig {

    public static final String CATEGORY_DYNAMIC_LIGHTS = "Dynamic Lights";
    public static final String CATEGORY_RENDERING = "Rendering";

    public static final String CATEGORY_OTHER = "Other";

    public static boolean dynamicLightsEnabled;
    public static int dynamicLightsUpdateInterval;

    public static float renderGlobalMultiplier;
    public static float renderWidthMultiplier;
    public static float renderOpacityMultiplier;
    public static float renderSmoothingMultiplier;
    public static float renderLightingMultiplier;
    public static boolean enableShaders;

    public static boolean denyAnimations;
    public static boolean disableCaves;
    public static boolean fullDenyAnimations;
    public static String[] denyAnimationslist;

    public static Configuration configFile;

    public static void load(Configuration config) {
        configFile = config;

        dynamicLightsEnabled = configFile.getBoolean(
            "Enable Dynamic Lights Support",
            CATEGORY_DYNAMIC_LIGHTS,
            true,
            "Whether support for Dynamic Lights is enabled.");
        dynamicLightsUpdateInterval = configFile.getInt(
            "Dynamic Lights Update Interval",
            CATEGORY_DYNAMIC_LIGHTS,
            1000,
            0,
            Integer.MAX_VALUE,
            "Update Interval time for all EntityLiving in milliseconds. The lower the better and costlier.");

        renderGlobalMultiplier = configFile.getFloat(
            "Global Multiplier",
            CATEGORY_RENDERING,
            1,
            0,
            Float.MAX_VALUE,
            "Global multiplier for lightsaber rendering values.");
        renderWidthMultiplier = configFile.getFloat(
            "Width Multiplier",
            CATEGORY_RENDERING,
            1,
            0,
            Float.MAX_VALUE,
            "Multiplier for lightsaber width.");
        renderOpacityMultiplier = configFile.getFloat(
            "Opacity Multiplier",
            CATEGORY_RENDERING,
            1,
            0,
            Float.MAX_VALUE,
            "Multiplier for lightsaber opacity.");
        renderSmoothingMultiplier = configFile.getFloat(
            "Smoothing Multiplier",
            CATEGORY_RENDERING,
            1,
            0,
            Float.MAX_VALUE,
            "Multiplier for lightsaber smooth lighting. (The higher, the prettier, but also more resource-costly.)");
        renderLightingMultiplier = configFile.getFloat(
            "Lighting Multiplier",
            CATEGORY_RENDERING,
            1,
            0,
            Float.MAX_VALUE,
            "Multiplier for lightsaber lighting.");
        enableShaders = configFile
            .getBoolean("Enable Shaders", CATEGORY_RENDERING, true, "Enable use of shaders for certain Force powers?");
        fullDenyAnimations = config
            .getBoolean("Completely deny animations", CATEGORY_OTHER, false, "Disable all animations from this mod?");
        denyAnimations = config.getBoolean(
            "Deny animations",
            CATEGORY_OTHER,
            true,
            "Disable the animations from this mod for specified things?");
        disableCaves = config
            .getBoolean("Disable Caves", CATEGORY_OTHER, false, "Disable Cave entrances this mod adds");
        denyAnimationslist = config.getStringList(
            "Deny animations list",
            CATEGORY_OTHER,
            new String[] { "hbm:item.dieselsuit_plate", "hbm:item.t45_plate", "hbm:item.ajr_plate",
                "hbm:item.ajro_plate", "hbm:item.rpa_plate", "hbm:item.bj_plate", "hbm:item.bj_plate_jetpack",
                "hbm:item.envsuit_plate", "hbm:item.hev_plate", "hbm:item.fau_plate", "hbm:item.dns_plate",
                "hbm:item.trenchmaster_plate", "hbm:item.steamsuit_plate", "Thaumcraft:ItemChestplateCultistRobe",
                "Thaumcraft:ItemChestplateFortress", "Thaumcraft:ItemChestplateVoidFortress",
                "Thaumcraft:ItemChestplateCultistPlate", "Thaumcraft:ItemChestplateCultistLeaderPlate" },
            "List of items for which animation will be denied (chestplate, modid:itemName)");
    }
}
