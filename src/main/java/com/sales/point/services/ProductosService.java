package com.sales.point.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.point.models.Productos;
import com.sales.point.repositories.IProductosRepository;


@Service
public class ProductosService implements IProductosService{

    @Autowired
    private IProductosRepository _iproductos;

    @Override
    public List<Productos> getProductos() {
        
        try{
            List<Productos> listaProductos =  new ArrayList<>();
            listaProductos = _iproductos.findAll();
            return listaProductos;

        }catch(Exception e){
            System.out.println("+++"+e.getMessage());
            return null;
        }
    }

    @Override
    public Productos getProducto(int id) {
    
        try{
            Productos productos = _iproductos.findById(id).get();
            return productos;

        }catch(Exception e){
            System.out.println("****"+e.getMessage());
            return null;
        }
    }

    @Override
    public Productos agregarProductos(String codigo, String nombre, String descripcion, Integer id_categoria) {
        try {
            Productos nuevo = new Productos();
            nuevo.setCodigoProducto(codigo);
            nuevo.setNombreProducto(nombre);
            nuevo.setDescripcionProducto(descripcion);
            nuevo.setId_categoria(id_categoria);
            Productos productos  = _iproductos.saveAndFlush(nuevo);
            return productos;
        } catch (Exception e) {
            System.out.println("+++"+e.getMessage());
            return null;
        }
    }

    @Override
    public String actualizarProducto() {
        
        return null;
    }

    @Override
    public Integer eliminarProducto() {
       
        return null;
    }
    
}
