package com.example.httpclientexemplu.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategorieDTO {
    private Long id;
    private String nume;
    private String descriere;
    private List<ProdusDTO> produse;
}
