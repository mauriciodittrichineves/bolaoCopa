package br.com.mauraumdev.bolaoCopa.services;

import br.com.mauraumdev.bolaoCopa.dto.AddressDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "address-client", url = "viacep.com.br/ws/")
public interface AddressClient {

    @GetMapping(path = "/{cep}/json")
    ResponseEntity<AddressDto> findByCep(@RequestParam("cep") String document);
}
