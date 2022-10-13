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
        // TODO Auto-generated method stub
        try{
            List<Productos> listaProductos =  new ArrayList<>();
            listaProductos = _iproductos.findAll();
            return listaProductos;

        }catch(Exception e){
            return null;
        }
    }

    @Override
    public Productos getProducto(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Productos agregarProductos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String actualizarProducto() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer eliminarProducto() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
