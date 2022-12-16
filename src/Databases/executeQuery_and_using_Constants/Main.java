package Databases.executeQuery_and_using_Constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");

            insertContact(statement, "Tim", 654321, "tim@email.com");
            insertContact(statement, "Joe", 987650, "joe@email.com");
            insertContact(statement, "Jane", 567890, "jane@email.com");
            insertContact(statement, "Fido", 123456, "fido@email.com");
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                " ) " +
                "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }
}
