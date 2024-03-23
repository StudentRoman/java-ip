package edu.penzgtu.ip.singleton;

public class Database {
    public static void getConnection(String url, String username) {
        System.out.println("The connection to the database has been created");
        System.out.printf("URL - %s USERNAME - %s%n", url, username);
    }
}
