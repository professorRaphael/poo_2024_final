package com.aula2024.poo_2024_final.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contato {
    @Id
    private int id;
    private String nome;
    private String telefone;

    public Contato() {
    }

    public Contato(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
