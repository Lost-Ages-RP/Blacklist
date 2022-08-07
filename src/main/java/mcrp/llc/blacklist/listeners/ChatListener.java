package mcrp.llc.blacklist.listeners;

import mcrp.llc.blacklist.util.Search;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        String s = Search.searchList(event.getMessage());
        if (s != null) {
            Bukkit.broadcastMessage(s);
        }
    }
}
