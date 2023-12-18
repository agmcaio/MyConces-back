package com.br.edu.pweb.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.rmi.server.UID;

@Entity
@Table(name = "tba_Carro")
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
}
