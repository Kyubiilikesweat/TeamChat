package kyubii.de.teamchat;

import org.bukkit.plugin.java.JavaPlugin;

public final class TeamChat extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveConfig();
        getConfig().addDefault("Prefix", "&8[&bTeamchat&8] &e%PLAYER%&7: &9");
        getConfig().addDefault("Permission", "teamchat.chat");
        saveConfig();
        reloadConfig();
        getCommand("Teamchat").setExecutor(new TeamchatCommand());
        getCommand("Toggleteamchat").setExecutor(new ToggleTeamchatCommand());
        getCommand("Toggletc").setExecutor(new ToggleTeamchatCommand());
        getCommand("Tc").setExecutor(new TeamchatCommand());
        getCommand("Reloadteamchatconfig").setExecutor(new ConfigReloadCommand());
        getCommand("Rltcconfig").setExecutor(new ConfigReloadCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
