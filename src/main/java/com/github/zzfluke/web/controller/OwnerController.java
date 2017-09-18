package com.github.zzfluke.web.controller;


import com.github.zzfluke.persistance.dao.OwnerRepository;
import com.github.zzfluke.persistance.model.Owner;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class OwnerController {

    private OwnerRepository ownerRepository;

    public OwnerController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @PostMapping("/owner")
    @ResponseStatus(HttpStatus.CREATED)
    public void addOwner(@RequestBody Owner owner) {
        ownerRepository.save(owner);
    }

    @GetMapping("/owner")
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }
}
