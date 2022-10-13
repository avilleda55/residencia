package com.sales.point.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="PRODUCTOS")

public class Productos implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProducto;

    @Column(name = "codigo")
    private String codigoProducto;

    @Column(name = "nombre")
    private String nombreProducto;

    @Column(name = "descripcion")
    private String descripcionProducto;

    @Lob
    @Column(name = "imagen")
    private byte[] imagenProducto;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoria_id", referencedColumnName = "idCategoria")
    private Categoria categoria;

    @OneToOne(mappedBy = "DETALLE_STOCK")
    private DetalleStock detallestock;
}
