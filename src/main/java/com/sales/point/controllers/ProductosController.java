package com.sales.point.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sales.point.models.Productos;
import com.sales.point.services.IProductosService;



@RestController
@RequestMapping("store")
@CrossOrigin(origins = "*")
public class ProductosController {
    @Autowired
    IProductosService _IPService;

    @GetMapping("getProducts")
    public ResponseEntity<Object> getProductos() {
        List<Productos> listaProductos = _IPService.getProductos();
        return new ResponseEntity<>(listaProductos,HttpStatus.OK);
    }

    @GetMapping("getProduct")
    public ResponseEntity<Object> getProducto(@RequestParam int idProducto){
        Productos producto = _IPService.getProducto(idProducto);
        return new  ResponseEntity<>(producto, HttpStatus.OK);
    }

    @PostMapping("createProduct")
    public ResponseEntity<Object> crearProducto(@RequestParam String codigoProducto, String nombreProducto, String descripcionProducto, Integer id_categoria){
       Productos producto = _IPService.agregarProductos(codigoProducto, nombreProducto, descripcionProducto, id_categoria);
        return new  ResponseEntity<>(producto, HttpStatus.CREATED);
    }


}
