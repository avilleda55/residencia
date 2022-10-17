package com.sales.point.services;

import java.util.List;

import com.sales.point.models.Categoria;

public interface ICategoriasService {
    List<Categoria> getCategorias();
    Categoria getCategoria(int id);
    Categoria agregarCategoria(String nombre);
    String actualizarCategoria(int id,String nombre);
    Integer eliminarCategoria();
}
