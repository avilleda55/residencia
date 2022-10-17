package com.sales.point.services;

import java.util.List;

import com.sales.point.models.DetalleStock;

public interface IStockDetalleService {
    List<DetalleStock> getStock();
    DetalleStock getProducto(int id);
    DetalleStock agregarStock(String codigo, Float precio_c, Float precio_v, Integer cantidad);
    String actualizarStock(int id,String codigo, Float precio_c, Float precio_v, Integer cantidad);
    Integer eliminarStock(int id);
}
