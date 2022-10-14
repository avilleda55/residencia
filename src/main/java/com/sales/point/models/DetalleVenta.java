package com.sales.point.models;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.*;

@Getter
@Setter
@Entity
@Table(name="DETALLE_VENTA")

public class DetalleVenta implements Serializable{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDetalleVenta;

    @Column(name = "id_detalle_stock")
    private DetalleStock id_detalle_stock;


    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "descuento")
    private Double descuento;

    @Column(name = "id_venta")
    private String id_venta;



    

    
}
