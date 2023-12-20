package com.br.edu.pweb.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "tba_carro")
@Getter
@Setter
@AllArgsConstructor
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marca;
    private String modelo;
    private String cor;
    private String anoFabricacao;
    private String quilometragem;
    private BigDecimal preco;
    private String categoria;
    private Integer qtdDisponivel;

    public Carro(String marca, String modelo, String cor, String anoFabricacao, String quilometragem, BigDecimal preco, String catergoria, Integer qtdDisponivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
        this.preco = preco;
        this.categoria = catergoria;
        this.qtdDisponivel = qtdDisponivel;
    }

    public Carro() {
    }
}
