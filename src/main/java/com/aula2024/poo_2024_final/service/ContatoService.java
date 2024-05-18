package com.aula2024.poo_2024_final.service;

import com.aula2024.poo_2024_final.model.Contato;
import com.aula2024.poo_2024_final.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository contatoRepository;

    public List<Contato> listarContatos() {
        return contatoRepository.findAll();
    }

    public Contato adicionarContato(Contato contato) {
        return contatoRepository.save(contato);
    }

    public Contato atualizarContato(Contato contato) {
        return contatoRepository.save(contato);
    }

    public void excluirContato(int id) {
        contatoRepository.deleteById(id);
    }

    public Contato obterContatoPorId(int id) {
        Optional<Contato> contato = contatoRepository.findById(id);
        return contato.orElse(null); // Retorna o contato se encontrado, caso contrário retorna null
    }
}
