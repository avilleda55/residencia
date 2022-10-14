package com.sales.point.models;

import java.io.Serializable;
import java.util.Calendar;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="VENTA")

public class Venta implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idVenta;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "vendedor")
    private Integer vendedor;

    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Calendar fecha;
    
    @Column(name = "cliente")
    private Integer cliente;
    
    @Column(name = "tipo_pago")
    private String tipo_pago;
    
}
