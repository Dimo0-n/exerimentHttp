package com.example.httpclientexemplu.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdusDTO {
    private Long id;
    private String nume;
    private Double pret;

}
