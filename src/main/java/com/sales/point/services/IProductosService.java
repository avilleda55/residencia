package com.sales.point.services;

import java.util.List;

import com.sales.point.models.Productos;

public interface IProductosService {
    List<Productos> getProductos();
    Productos getProducto(int id);
    Productos agregarProductos();
    String actualizarProducto();
    Integer eliminarProducto();
    
}
