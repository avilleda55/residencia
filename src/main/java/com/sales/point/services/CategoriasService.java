package com.sales.point.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.point.models.Categoria;
import com.sales.point.repositories.ICategoriasRepository;

@Service
public class CategoriasService implements ICategoriasService {

    @Autowired
    private ICategoriasRepository _icategorias;

    @Override
    public List<Categoria> getCategorias() {
        try {
            List<Categoria> categorias = new ArrayList<>();
            categorias = _icategorias.findAll();
            return categorias;

        } catch (Exception e) {
            System.out.println("EXCEPTION: " + e.getMessage());
            return null;
        }

    }

    @Override
    public Categoria getCategoria(int id) {
        try {
            Categoria categoria = _icategorias.findById(id).get();
            return categoria;

        } catch (Exception e) {
            System.out.println("EXCEPTION: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Categoria agregarCategoria(String nombre) {

        try {
            Categoria nuevo = new Categoria();
            nuevo.setNombreCategoria(nombre);
            Categoria categoria = _icategorias.saveAndFlush(nuevo);
            return categoria;
        } catch (Exception e) {
            System.out.println("EXEPTION: " + e.getMessage());
            return null;
        }
    }

    @Override
    public String actualizarCategoria(int id, String nombre) {
        try {
            Categoria select = _icategorias.findById(id).get();
            select.setNombreCategoria(nombre);
            _icategorias.saveAndFlush(select);
            return "Modificado";
        } catch (Exception e) {
            System.out.println("EXEPTION: " + e.getMessage());
            return "Error en la actualización";
        }
    }

    @Override
    public Integer eliminarCategoria() {

        return null;
    }

}
