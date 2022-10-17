package com.sales.point.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sales.point.models.DetalleStock;
import com.sales.point.services.IStockDetalleService;

@RestController
@RequestMapping("store")
@CrossOrigin(origins = "*")
public class DetalleStockController {

    @Autowired
    IStockDetalleService _ISService;
    @GetMapping("getStock")
    public ResponseEntity<Object> getStock() {
        List<DetalleStock> listaProductos = _ISService.getStock();
        return new ResponseEntity<>(listaProductos,HttpStatus.OK);
    }

    @GetMapping("getStockProduct")
    public ResponseEntity<Object> getCategoria(@RequestParam int idDetalleS){
        DetalleStock producto = _ISService.getProducto(idDetalleS);
        return new  ResponseEntity<>(producto, HttpStatus.OK);
    }

    @PostMapping("registerStock")
    public ResponseEntity<Object> agregarStock(@RequestParam String producto_id, Float precio_c_DetalleS, Float precio_v_DetalleS, Integer cantidad_DetalleS){
        DetalleStock stock = _ISService.agregarStock(producto_id, precio_c_DetalleS, precio_v_DetalleS, cantidad_DetalleS);
        return new  ResponseEntity<>(stock, HttpStatus.CREATED);
    }

    @PutMapping("modifyStock")
    public ResponseEntity<Object> actualizarCategoria(@RequestParam Integer idDetalleS, String producto_id, Float precio_c_DetalleS, Float precio_v_DetalleS, Integer cantidad_DetalleS){
        String stock = _ISService.actualizarStock(idDetalleS, producto_id, precio_c_DetalleS, precio_v_DetalleS, cantidad_DetalleS);
        return new  ResponseEntity<>(stock, HttpStatus.OK);
    }
    
}
