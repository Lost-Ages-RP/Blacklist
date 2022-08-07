package mcrp.llc.blacklist;

import mcrp.llc.blacklist.config.BlacklistConfig;
import mcrp.llc.blacklist.enums.Status;
import mcrp.llc.blacklist.util.Search;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class Blacklist extends JavaPlugin {

    public static HashMap<String, Status> blacklist;

    @Override
    public void onEnable() {
        BlacklistConfig.setup();

        blacklist = Search.loadBlacklist();
    }

    @Override
    public void onDisable() {
        BlacklistConfig.save();
    }
}
