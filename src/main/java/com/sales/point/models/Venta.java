package com.sales.point.models;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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

    @OneToOne(mappedBy = "DETALLE_VENTA")
    private Productos codigo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vendedor_id", referencedColumnName = "idUsuario")
    private Usuario vendedor;


    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Calendar fecha;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id", referencedColumnName = "idUsuario")
    private Usuario cliente;
    
    @Column(name = "tipo_pago")
    private String tipo_pago;



    
}
