package com.example.httpclientexemplu.controller;

import com.example.httpclientexemplu.entity.CategorieDTO;
import com.example.httpclientexemplu.entity.ProdusDTO;
import com.example.httpclientexemplu.service.CategorieClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class CategorieClientController {

    @Autowired
    private CategorieClientService service;

    @GetMapping("/categorii")
    public List<CategorieDTO> toateCategorii() {
        return service.getCategorii();
    }

    @GetMapping("/categorii/{id}")
    public CategorieDTO getCategorie(@PathVariable Long id) {
        return service.getCategorieById(id);
    }

    @PostMapping("/categorii")
    public CategorieDTO adaugaCategorie(@RequestBody CategorieDTO categorie) {
        return service.postCategorie(categorie);
    }

    @PostMapping("/categorii/{id}/produse")
    public ProdusDTO adaugaProdus(@PathVariable Long id, @RequestBody ProdusDTO produs) {
        return service.postProdusInCategorie(id, produs);
    }
}
