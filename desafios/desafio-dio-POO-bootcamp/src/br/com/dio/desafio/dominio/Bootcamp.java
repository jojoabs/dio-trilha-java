package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final Set<Conteudo> conteudos = new HashSet<>();
    private final Set<Dev> devsInscritos = new HashSet<>();

    // Métodos para gerenciar conteúdos e inscrições
    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
}
