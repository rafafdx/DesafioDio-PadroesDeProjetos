package com.desafiodio.cep_consulta.service;

import com.desafiodio.cep_consulta.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private final CepServiceStrategy cepService;

    @Autowired
    public AddressService(ViaCepService viaCepService) {
        this.cepService = viaCepService;
    }

    public Address getAddress(String cep) {
        return cepService.findAddressByCep(cep);
    }
}
