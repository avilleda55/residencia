package com.sales.point.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sales.point.models.Categoria;
import com.sales.point.services.ICategoriasService;

@RestController
@RequestMapping("store")
@CrossOrigin(origins = "*")
public class CategoriasController {
    @Autowired
    ICategoriasService _ICService;

    @GetMapping("getCategories")
    public ResponseEntity<Object> getProductos() {
        List<Categoria> listaProductos = _ICService.getCategorias();
        return new ResponseEntity<>(listaProductos,HttpStatus.OK);
    }

    @GetMapping("getCategory")
    public ResponseEntity<Object> getCategoria(@RequestParam int idCategoria){
        Categoria categoria = _ICService.getCategoria(idCategoria);
        return new  ResponseEntity<>(categoria, HttpStatus.OK);
    }

    @PostMapping("createCategory")
    public ResponseEntity<Object> crearCategoria(@RequestParam String nombreCategoria){
        Categoria categoria = _ICService.agregarCategoria(nombreCategoria);
        return new  ResponseEntity<>(categoria, HttpStatus.CREATED);
    }

    @PutMapping("modifyCategory")
    public ResponseEntity<Object> actualizarCategoria(@RequestParam int idCategoria,String nombreCategoria){
        String categoria = _ICService.actualizarCategoria(idCategoria,nombreCategoria);
        return new  ResponseEntity<>(categoria, HttpStatus.OK);
    }

}
