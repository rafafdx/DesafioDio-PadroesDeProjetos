package com.desafiodio.cep_consulta.controller;

import com.desafiodio.cep_consulta.model.Address;
import com.desafiodio.cep_consulta.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/{cep}")
    public ResponseEntity<Address> getAddress(@PathVariable String cep) {
        Address address = addressService.getAddress(cep);
        return ResponseEntity.ok(address);
    }
}
