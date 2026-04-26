package com.melita.cafeshop;

import org.mindrot.jbcrypt.BCrypt;

public final class PasswordUtil {

    private static final int COST = 12;

    private PasswordUtil() {
        // prevent instantiation
    }

    public static String hash(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt(COST));
    }

    public static boolean verify(String plainPassword, String storedHash) {
        if (storedHash == null || !storedHash.startsWith("$2")) {
            return false;
        }
        return BCrypt.checkpw(plainPassword, storedHash);
    }
}
