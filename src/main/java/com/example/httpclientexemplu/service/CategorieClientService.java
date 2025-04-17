package com.example.httpclientexemplu.service;

import com.example.httpclientexemplu.entity.CategorieDTO;
import com.example.httpclientexemplu.entity.ProdusDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CategorieClientService {

    @Value("${remote.server.url}")
    private String serverUrl;

    @Autowired
    private RestTemplate restTemplate;

    public List<CategorieDTO> getCategorii() {
        ResponseEntity<CategorieDTO[]> response = restTemplate.getForEntity(serverUrl + "/categorii", CategorieDTO[].class);
        return Arrays.asList(response.getBody());
    }

    public CategorieDTO getCategorieById(Long id) {
        return restTemplate.getForObject(serverUrl + "/categorii/" + id, CategorieDTO.class);
    }

    public CategorieDTO postCategorie(CategorieDTO categorie) {
        return restTemplate.postForObject(serverUrl + "/categorii", categorie, CategorieDTO.class);
    }

    public ProdusDTO postProdusInCategorie(Long categorieId, ProdusDTO produs) {
        return restTemplate.postForObject(serverUrl + "/categorii/" + categorieId + "/produse", produs, ProdusDTO.class);
    }
}
