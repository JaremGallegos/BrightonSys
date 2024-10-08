package com.brighton.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="categoria")
public class Categoria {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String descripcion;
}
