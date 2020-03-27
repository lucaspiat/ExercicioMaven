package com.fundamentosds;

public class Passageiro {
    private String cpf;
    private String nome;
    private String nroCartao;
    private FormaPagamento formaPagto;

    public Passageiro(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public FormaPagamento getFormaPagto() {
        return formaPagto;
    }

    public String getNroCartao() {
        return nroCartao;
    }
}