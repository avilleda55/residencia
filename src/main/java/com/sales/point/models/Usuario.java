package com.sales.point.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idUsuario;

    @Column(name = "nombre")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "autenticacion")
    private String useraut;

    @Column(name = "direccion")
    private String useraddress;

    @Column(name = "telefono")
    private String usertelefono;

    @Column(name = "rol")
    private String userrol;


    
    

    


 
}
