package com.aula2024.poo_2024_final.controller;

import com.aula2024.poo_2024_final.model.Contato;
import com.aula2024.poo_2024_final.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @GetMapping("/contatos")
    public String listarContatos(Model model) {
        List<Contato> contatos = contatoService.listarContatos();
        model.addAttribute("contatos", contatos);
        return "listarContatos";
    }

    @GetMapping("/contatos/novo")
    public String novoContatoForm(Model model) {
        model.addAttribute("contato", new Contato());
        return "novoContato";
    }

    @PostMapping("/contatos")
    public String adicionarContato(@ModelAttribute Contato contato) {
        contatoService.adicionarContato(contato);
        return "redirect:/contatos";
    }

    @GetMapping("/contatos/editar/{id}")
    public String editarContatoForm(@PathVariable int id, Model model) {
        Contato contato = contatoService.obterContatoPorId(id);
        model.addAttribute("contato", contato);
        return "editarContato";
    }

    @PostMapping("/contatos/editar/{id}")
    public String atualizarContato(@PathVariable int id, @ModelAttribute Contato contato) {
        contato.setId(id);
        contatoService.atualizarContato(contato);
        return "redirect:/contatos";
    }

    @GetMapping("/contatos/excluir/{id}")
    public String excluirContato(@PathVariable int id) {
        contatoService.excluirContato(id);
        return "redirect:/contatos";
    }
}
