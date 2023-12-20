package com.br.edu.pweb.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tba_usuario")
@Getter
@Setter
@AllArgsConstructor
public class Usuario {
    private String nome;
    private String senha;
    @Id
    private Long id;

    public Usuario() {

    }
}
