package com.aurionpro.ecommerce_miniproject.utils;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class UserSessionTracker {
    private static final Set<String> loggedInUsers = ConcurrentHashMap.newKeySet();

    public static void addUser(String username) {
        loggedInUsers.add(username);
    }

    public static void removeUser(String username) {
        loggedInUsers.remove(username);
    }

    public static int getOnlineUserCount() {
        return loggedInUsers.size();
    }

    public static boolean isUserOnline(String username) {
        return loggedInUsers.contains(username);
    }
}
