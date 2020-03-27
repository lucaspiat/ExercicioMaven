package com.fundamentosds;

public class Veiculo {
    private String placa;
    private String marca;
    private String cor;
    private Categoria categoriaVeiculo;

    private Veiculo(String placa, String marca, String cor, Categoria categoriaVeiculo) {
        this.placa = placa;
        this.marca = marca;
        this.cor = cor;
        this.categoriaVeiculo = categoriaVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public Categoria getCategoria() {
        return categoriaVeiculo;
    }
}