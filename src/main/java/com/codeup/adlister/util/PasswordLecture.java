package com.codeup.adlister.util;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordLecture {
    public static void main(String[] args) {
        String password = "password123";
        String password1 = "password";
        String hash = BCrypt.hashpw(password, BCrypt.gensalt(12));
        String hash1 = BCrypt.hashpw(password, BCrypt.gensalt(12));
        System.out.println(hash);
        System.out.println(hash1);

        boolean match = BCrypt.checkpw("password123", hash);

        boolean match1 = BCrypt.checkpw("password", hash);

        System.out.println(match);
        System.out.println(match1);
    }
}
