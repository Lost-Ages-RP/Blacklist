package mcrp.llc.blacklist.util;

import mcrp.llc.blacklist.Blacklist;
import mcrp.llc.blacklist.config.BlacklistConfig;
import mcrp.llc.blacklist.enums.Status;

import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {

    public static HashMap<String, Status> loadBlacklist() {
        List<String> s = BlacklistConfig.get().getStringList("blacklist");
        HashMap<String, Status> blacklist = new HashMap<>();
        for (String str : s) {
            String[] words = str.split(":");
            blacklist.put(words[0], Status.getStatus(words[1]));
        }
        return blacklist;
    }

    public static String searchList(String message) {
        String s = "";
        for(String word: Blacklist.blacklist.keySet()) {
            Pattern pattern = Pattern.compile("/." + word + "./gi");
            Matcher matcher = pattern.matcher(message);
            if (matcher.find()) {
                s = "bad!";
            }
        }
        return s;
    }
}
