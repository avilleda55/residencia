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


import com.sales.point.models.Usuario;
import com.sales.point.services.IUsuariosService;


@RestController
@RequestMapping("store")
@CrossOrigin(origins = "*")
public class UsuariosController {
    @Autowired IUsuariosService _IUService;

    @GetMapping("getUsers")
    public ResponseEntity<Object> getUsuarios() {
        List<Usuario> listaUsuarios = _IUService.getUsuarios();
        return new ResponseEntity<>(listaUsuarios,HttpStatus.OK);
    }

    @GetMapping("getUser")
    public ResponseEntity<Object> getUsuario(@RequestParam int idUsuario){
        Usuario usuario = _IUService.getUsuario(idUsuario);
        return new  ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @PostMapping("createUser")
    public ResponseEntity<Object> crearUsuario(@RequestParam String nombreUsuario, String usernameUsuario, String autenticationUsuario, String direccionUsuario, String telefonoUsuario, String rolUsuario){
        Usuario usuario = _IUService.agregarUsuario(nombreUsuario, usernameUsuario, autenticationUsuario, direccionUsuario, telefonoUsuario, rolUsuario);
        return new  ResponseEntity<>(usuario, HttpStatus.CREATED);
    }
}
