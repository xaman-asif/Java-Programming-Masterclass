package chapter19.JDBC_Insert_Update_Delete;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:testjava.db");
            //conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");

            //statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('John', 123456, 'john@email.com')");
            //statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('Doe', 123456, 'doe@email.com')");
            //statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('Jane', 123456, 'jane@email.com')");

            //statement.execute("UPDATE contacts SET phone = 654321 WHERE name='Jane'");
            //statement.execute("DELETE from contacts WHERE name='John'");

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();

            while (results.next()) {
                System.out.println( results.getString("name") + " " +
                                    results.getInt("phone") + " " +
                                    results.getString("email"));
            }

            statement.close();

            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
