package br.fiap.assistencia.tecnica.domain;

import jakarta.persistence.*;

@Entity //DEFINE CLASSE COMO ENTIDADE
@Table(name = "JAVA_CLIENTE") //USADO PARA INDICAR A QUAL TABELA A CLASSSE É (se foss nomes iguais nao precisaria)
public class Cliente {
    //ATRIBUTOS
    @Id //DEFINE CHAVE PRIMARIA
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE") //CHAVE PRIMARIA
    private Long id;

    @Column(name = "NOME", nullable = false, length = 120)
    private String nome;

    @Column(name = "EMAIL", nullable = false, length = 120)
    private String email;

    @Column(name = "TELEFONE", nullable = false, length = 20)
    private String telefone;

    @Column(name = "SENHA", nullable = false, length = 512)
    private String senha;

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
