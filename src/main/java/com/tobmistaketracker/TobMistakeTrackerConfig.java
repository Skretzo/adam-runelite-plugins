package com.tobmistaketracker;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import static com.tobmistaketracker.TobMistakeTrackerPlugin.CLEAR_MISTAKES_KEY;

@ConfigGroup(TobMistakeTrackerPlugin.CONFIG_GROUP)
public interface TobMistakeTrackerConfig extends Config {

    @ConfigItem(
            keyName = "spectatingEnabled",
            name = "Enable Spectacting",
            description = "Enable tracking mistakes while spectating another raid",
            position = 1
    )
    default boolean spectatingEnabled() {
        return false;
    }

    @ConfigItem(
            keyName = CLEAR_MISTAKES_KEY,
            name = "Clear Mistakes",
            description = "Clear all mistakes",
            position = 2
    )
    default boolean clearMistakes() {
        return false;
    }

    @ConfigItem(
            keyName = "isDebug",
            name = "Debug",
            description = "Toggle Debug Mode",
            position = 99,
            hidden = false // This must be true when pushing to prod
    )
    default boolean isDebug() {
        return false;
    }
}
