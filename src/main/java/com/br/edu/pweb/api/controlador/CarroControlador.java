package com.br.edu.pweb.api.controlador;

import com.br.edu.pweb.api.models.Carro;
import com.br.edu.pweb.api.models.CarroInserirDTO;
import com.br.edu.pweb.api.models.CarroListagemDTO;
import com.br.edu.pweb.api.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroControlador {

    @Autowired
    private CarroService carroService;

    @GetMapping
    public List<CarroListagemDTO> listar(@RequestParam(value = "modelo", required = false) String modelo) {
        if (modelo != null && !modelo.isBlank()) {
            var carroPesquisado = this.carroService.getCarroPorModelo(modelo);
            if (carroPesquisado != null) {
                return Collections.singletonList(carroPesquisado);
            }
            return null;
        }
        return this.carroService.getListCarro();
    }

    @GetMapping("/{id}")
    public Carro getCarroById(@PathVariable("id") Long idCarro) {
        return this.carroService.getCarroById(idCarro);
    }

    @PostMapping
    public Carro inserir(@RequestBody CarroInserirDTO carro) {
        var carroAinserir = new Carro(carro.cor(), carro.modelo(), carro.cor(), carro.anoFabricacao(), carro.quilometragem(), carro.preco(), carro.categoria(), carro.qtdDisponivel());
        return this.carroService.inserirOuAtualizar(carroAinserir);    }

    @PutMapping("/{id}")
    public Carro atualizar(@RequestBody Carro carro) {
        return this.carroService.inserirOuAtualizar(carro);
    }

    @DeleteMapping("/{id}")
    public void apagar(@PathVariable("id") Long id) {
        this.carroService.apagar(id);
    }

}
