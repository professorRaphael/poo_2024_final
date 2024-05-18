package com.aula2024.poo_2024_final;

import com.aula2024.poo_2024_final.model.Contato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {
    // Configurações de conexão para PostgreSQL
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/contatos.db";
    private static final String DATABASE_USER = "postgres";
    private static final String DATABASE_PASSWORD = "123456";
    private static final String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS contatos (id SERIAL PRIMARY KEY, nome VARCHAR(100), telefone VARCHAR(15))";
    private static final String INSERT_CONTATO_SQL = "INSERT INTO contatos (nome, telefone) VALUES (?, ?)";
    private static final String SELECT_ALL_CONTATOS_SQL = "SELECT * FROM contatos";
    private static final String UPDATE_CONTATO_SQL = "UPDATE contatos SET nome = ?, telefone = ? WHERE id = ?";
    private static final String DELETE_CONTATO_SQL = "DELETE FROM contatos WHERE id = ?";

    public static void criarTabela() {
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(CREATE_TABLE_SQL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Contato> listarContatos() {
        List<Contato> contatos = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SELECT_ALL_CONTATOS_SQL)) {
            while (resultSet.next()) {
                Contato contato = new Contato();
                //contato.setId(resultSet.getInt("id"));
                contato.setNome(resultSet.getString("nome"));
                contato.setTelefone(resultSet.getString("telefone"));
                contatos.add(contato);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return contatos;
    }

    // Implementar os métodos de CRUD (create, read, update, delete)
    public static void adicionarContato(Contato contato) {
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(INSERT_CONTATO_SQL)) {
            statement.setString(1, contato.getNome());
            statement.setString(2, contato.getTelefone());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void atualizarContato(Contato contato) {
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(UPDATE_CONTATO_SQL)) {
            statement.setString(1, contato.getNome());
            statement.setString(2, contato.getTelefone());
            statement.setInt(3, contato.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void excluirContato(int id) {
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(DELETE_CONTATO_SQL)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
