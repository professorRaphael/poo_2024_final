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

    public void adicionarContato(Contato contato) {
        contatoRepository.save(contato);
    }

    public Contato obterContatoPorId(int id) {
        Optional<Contato> optionalContato = contatoRepository.findById(id);
        return optionalContato.orElse(null);
    }

    public Contato atualizarContato(Contato contato) {
        Optional<Contato> contatoExistente = contatoRepository.findById(contato.getId());
        if (contatoExistente.isPresent()) {
            Contato c = contatoExistente.get();
            c.setNome(contato.getNome());
            c.setTelefone(contato.getTelefone());
            return contatoRepository.save(c);
        } else {
            throw new RuntimeException("Contato não encontrado com ID: " + contato.getId());
        }
    }

    public void excluirContato(int id) {
        contatoRepository.deleteById(id);
    }
}
