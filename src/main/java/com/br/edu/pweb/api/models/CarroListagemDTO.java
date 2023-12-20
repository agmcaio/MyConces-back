package com.br.edu.pweb.api.models;

import java.math.BigDecimal;

public record CarroListagemDTO (Long id, String marca, String modelo, String cor, String anoFabricacao, String quilometragem, BigDecimal preco, String categoria, Integer qtdDisponivel) {
    public CarroListagemDTO(Carro carro){
        this(carro.getId(), carro.getMarca(), carro.getModelo(),carro.getCor(), carro.getAnoFabricacao(), carro.getQuilometragem(), carro.getPreco(), carro.getCategoria(), carro.getQtdDisponivel());
    }
}