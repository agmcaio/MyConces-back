package com.br.edu.pweb.api.repository;

import com.br.edu.pweb.api.models.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.rmi.server.UID;
import java.util.Optional;
import java.util.List;

public interface ICarroRepository extends JpaRepository<Carro, Long> {

}
