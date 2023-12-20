package com.br.edu.pweb.api.service;

import com.br.edu.pweb.api.models.Carro;
import com.br.edu.pweb.api.models.CarroListagemDTO;
import com.br.edu.pweb.api.repository.ICarroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {
    @Autowired
    private ICarroRepository carroRepository;

    public List<CarroListagemDTO> getListCarro(){
        return this.carroRepository.findAll().stream().map(CarroListagemDTO::new).toList();
    }

    public Carro getCarroById(Long id){
        return this.carroRepository.findById(id).orElse(null);
    }

    @Transactional
    public Carro inserirOuAtualizar(Carro carro){
        var carroInserido = this.carroRepository.save(carro);
        return carroInserido;
    }

    public void apagar(Long id){
        this.carroRepository.deleteById(id);
    }

    public CarroListagemDTO getCarroPorModelo(String modelo) {
        var carroPesquisado = this.carroRepository.findByModelo(modelo);
        if (carroPesquisado != null) {
            return new CarroListagemDTO(carroPesquisado);
        }
        return null;
    }
}


