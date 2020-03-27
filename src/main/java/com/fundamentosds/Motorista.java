package com.fundamentosds;

public class Motorista {
    private String cpf;
    private String nome;
    private Veiculo veiculo;
    private FormaPagamento formaPagto;

    public Motorista(String cpf, String nome, Veiculo veiculo) {
        this.cpf = cpf;
        this.nome = nome;
        this.veiculo = veiculo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public FormaPagamento getFormaPagto() {
        return formaPagto;
    }
}