package com.sales.point.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.point.models.DetalleStock;
import com.sales.point.repositories.IDetalleStockRepository;

@Service
public class DetalleStockService implements IStockDetalleService{
    @Autowired
    IDetalleStockRepository _istock;

    @Override
    public List<DetalleStock> getStock() {
        try{
            List<DetalleStock> stock = new ArrayList<>();
            stock = _istock.findAll();
            return stock;
        }catch(Exception e){
            System.err.println("EXCEPTION: "+e.getMessage());
            return null;
        }
        
    }

    @Override
    public DetalleStock getProducto(int id) {
        try{
            DetalleStock producto = _istock.findById(id).get();
            return producto;
        }catch(Exception e){
            System.err.println("EXCEPTION: "+e.getMessage());
            return null;
        }
        
    }

    @Override
    public DetalleStock agregarStock(String codigo, Float precio_c, Float precio_v, Integer cantidad) {
        
        try {
            DetalleStock nuevo = new DetalleStock();
            nuevo.setProducto_id(codigo);
            nuevo.setPrecio_c_DetalleS(precio_c);
            nuevo.setPrecio_v_DetalleS(precio_v);
            nuevo.setCantidad_DetalleS(cantidad);
            DetalleStock stock  = _istock.saveAndFlush(nuevo);
            return stock;
        } catch (Exception e) {
            System.err.println("EXCEPTION: "+e.getMessage());
            return null;
        }
    }

    @Override
    public String actualizarStock(int id,String codigo, Float precio_c, Float precio_v, Integer cantidad) {
        
        try {
            DetalleStock nuevo = new DetalleStock();
            nuevo.setProducto_id(codigo);
            nuevo.setPrecio_c_DetalleS(precio_c);
            nuevo.setPrecio_v_DetalleS(precio_v);
            nuevo.setCantidad_DetalleS(cantidad);
             _istock.saveAndFlush(nuevo);
            return "Modificado";
        } catch (Exception e) {
            System.err.println("EXCEPTION: "+e.getMessage());
            return "Error en la acurlización";
        }
    }

    @Override
    public Integer eliminarStock(int id) {
        
        return null;
    }
    
}
