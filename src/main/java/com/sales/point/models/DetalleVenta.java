package com.sales.point.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detalle_stock_id", referencedColumnName = "idDetalleS")
    private DetalleStock id_detalle_stock;


    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "descuento")
    private String descuento;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "venta_id", referencedColumnName = "idVenta")
    private Venta id_venta;



    

    
}
