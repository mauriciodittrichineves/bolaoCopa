package br.com.mauraumdev.bolaoCopa.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "address-client", url = "viacep.com.br/ws/")
public interface AddressClient {

    @GetMapping(path = "/{cep}/json")
   Object findByCep(@RequestParam("cep") Object document);
}
