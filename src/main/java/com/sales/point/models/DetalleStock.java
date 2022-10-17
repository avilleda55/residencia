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
@Table(name = "DETALLE_STOCK")
public class DetalleStock implements Serializable{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDetalleS;

    @Column(name = "precio_c")
    private Float precio_c_DetalleS;

    @Column(name = "precio_v")
    private Float precio_v_DetalleS;

    @Column(name = "cantidad")
    private Integer cantidad_DetalleS;
    
    
    @Column(name = "producto_id")
    private String producto_id;

}
