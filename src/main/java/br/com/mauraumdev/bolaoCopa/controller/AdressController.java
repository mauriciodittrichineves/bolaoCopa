package br.com.mauraumdev.bolaoCopa.controller;

import br.com.mauraumdev.bolaoCopa.dto.AdressDto;
import br.com.mauraumdev.bolaoCopa.model.Adress;
import br.com.mauraumdev.bolaoCopa.services.AddressClient;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/adress")
public class AdressController {

    @Autowired
    AddressClient adressClient;

    @GetMapping("/{cpf}/endereco")
    public Optional<AdressDto> loadAdress(@PathVariable(value = "cpf")String cpf){
        var teste = adressClient.findByCep(cpf);
        Adress adress = new Adress();
        return Optional.ofNullable(teste.getBody());
    }

}
