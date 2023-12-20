package com.br.edu.pweb.api.models;

import java.math.BigDecimal;

public record CarroInserirDTO (String marca, String modelo, String cor, String anoFabricacao, String quilometragem, BigDecimal preco, String categoria, Integer qtdDisponivel) {

}
