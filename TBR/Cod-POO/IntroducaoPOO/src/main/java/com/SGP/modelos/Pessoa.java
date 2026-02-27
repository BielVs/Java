package com.sgp.modelos;  // Declaração do pacote

public class Carro {
    
    private String marca;  // Atributo privado
    private int ano;       // Atributo privado
    private double velocidade;  // Atributo privado

    // Construtor que recebe marca, ano e velocidade como parâmetros
    public Carro(String marca, int ano, double velocidade) {
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    // Construtor sobrecarregado que inicializa com valores padrão
    // marca="Toyota", ano=2020, velocidade=0
    public Carro() {
        this.marca = "Toyota";
        this.ano = 2020;
        this.velocidade = 0;
    }

    // Método que exibe uma mensagem com as informações do carro
    public void informacoes() {
        System.out.println("Marca: " + marca + 
                           ", Ano: " + ano + 
                           ", Velocidade: " + velocidade + " km/h.");
    }

    // Métodos Getters e Setters
    
    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return "Carro [marca=" + marca + 
               ", ano=" + ano + 
               ", velocidade=" + velocidade + " km/h]";
    }
}