package com.sales.point.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.*;

@Getter
@Setter
@Entity
@Table(name="CATEGORIA")

public class Categoria implements Serializable{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCategoria;

    @Column(name = "nombre")
    private String nombreCategoria;

    @OneToOne(mappedBy = "CATEGORIA")
    private Productos productos;
    
    
}
