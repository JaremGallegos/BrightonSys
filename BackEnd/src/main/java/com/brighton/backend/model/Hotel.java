package com.brighton.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="hoteles")
public class Hotel {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String titulo;
    private Integer ruc;
    private String direccion;
    private Integer telefono;
    private String descripcion;
    private String imagen;
    private String hapertura;
    private String hcierre;
    private String urlfacebook;
    private String urlwhatsapp;

    @ManyToOne
    @JoinColumn (name = "categoria_id")
    private Categoria categoriaId;
}
