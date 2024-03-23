package edu.penzgtu.ip.singleton;

public class DatabaseConnection {
    private static DatabaseConnection connection;
    private String url = "mongodb://localhost:27017";
    private String username = "root";


    private DatabaseConnection() {
        Database.getConnection(url, username);
    }

    public static DatabaseConnection getInstance() {
        if (connection == null) {
            connection = new DatabaseConnection();
        }
        return connection;
    }
}
