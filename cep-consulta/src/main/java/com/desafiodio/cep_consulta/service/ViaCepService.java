package com.desafiodio.cep_consulta.service;

import com.desafiodio.cep_consulta.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepService implements CepServiceStrategy {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Address findAddressByCep(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        return restTemplate.getForObject(url, Address.class);
    }
}
