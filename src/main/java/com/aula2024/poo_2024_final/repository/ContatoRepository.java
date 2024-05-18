package com.aula2024.poo_2024_final.repository;

import com.aula2024.poo_2024_final.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> { }