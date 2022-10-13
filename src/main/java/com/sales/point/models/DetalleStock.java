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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_producto", referencedColumnName = "codigoProducto")
    private String id_producto_DetalleS;

    @Column(name = "precio_c")
    private String precio_c_DetalleS;

    @Column(name = "precio_v")
    private String precio_v_DetalleS;

    @Column(name = "cantidad")
    private String cantidad_DetalleS;

}
