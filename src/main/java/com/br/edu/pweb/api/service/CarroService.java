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
        var carroExiste = getCarroById(carro.getId());

        if(carroExiste != null){
            Carro carroSalvo = this.carroRepository.save(carro);
            return carroSalvo;
        }

        carro.setId(carro.getId());
        carro.setModelo(carro.getModelo());
        carro.setMarca(carro.getMarca());
        carro.setCor(carro.getCor());
        carro.setCategoria(carro.getCategoria());
        carro.setPreco(carro.getPreco());
        carro.setQuilometragem(carro.getQuilometragem());
        carro.setAnoFabricacao(carro.getAnoFabricacao());
        carro.setQtdDisponivel(carro.getQtdDisponivel());

        return carro;
    }

    public void apagar(Long id){
        this.carroRepository.deleteById(id);
    }
}
