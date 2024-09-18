package com.brighton.backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String email;
    private LocalDateTime emailVerificadoAt;
    private String contraseñaHash;
    private String avatarUrl;
    private Boolean esAdmin;
    private String tokenRecordatorio;
}
