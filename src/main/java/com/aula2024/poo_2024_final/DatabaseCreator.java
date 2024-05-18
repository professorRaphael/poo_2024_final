package com.aula2024.poo_2024_final;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DatabaseCreator {
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/";
    private static final String DATABASE_NAME = "contatos";
    private static final String DATABASE_USER = "postgres";
    private static final String DATABASE_PASSWORD = "123456";

    public static void createDatabase() {
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD)) {
            Statement statement = connection.createStatement();
            String createDatabaseSql = "CREATE DATABASE IF NOT EXISTS " + DATABASE_NAME;
            statement.executeUpdate(createDatabaseSql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
            System.exit(1);
        }
    }
}
