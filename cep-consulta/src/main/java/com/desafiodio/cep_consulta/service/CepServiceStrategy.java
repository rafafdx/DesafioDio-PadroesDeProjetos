package com.desafiodio.cep_consulta.service;

import com.desafiodio.cep_consulta.model.Address;

public interface CepServiceStrategy {
    Address findAddressByCep(String cep);
}
