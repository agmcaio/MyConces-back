package com.br.edu.pweb.api.models;

public record CarroListagemDTO (Long id, String marca, String modelo) {
    public CarroListagemDTO(Carro carro){
        this(carro.getId(), carro.getMarca(), carro.getModelo());
    }
}