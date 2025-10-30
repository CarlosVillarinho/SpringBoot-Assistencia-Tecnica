package br.fiap.assistencia.tecnica.web.dto;

import lombok.Data;
import lombok.Getter;

//PASSEIA DE UM LADO PARA O OUTRO (entre Controller e Service)
//@Data //GERA AUTOMATICO OS GETS, SETS, TooSTRING...
public class ClienteDTO {
    //ATRIBUTOS
    private Long id;
    private String nome, email, telefone, senha;

    //GET AND SET
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
