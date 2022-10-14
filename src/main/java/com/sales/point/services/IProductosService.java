package com.sales.point.services;

import java.util.List;

import com.sales.point.models.Productos;

public interface IProductosService {
    List<Productos> getProductos();
    Productos getProducto(int id);
    Productos agregarProductos(String codigo, String nombre, String descripcion, Integer categoria);
    String actualizarProducto();
    Integer eliminarProducto();
    
}
