package com.sales.point.services;

import java.util.List;

import com.sales.point.models.Usuario;

public interface IUsuariosService {
    List<Usuario> getUsuarios();
    Usuario getUsuario(int id);
    Usuario agregarUsuario(String name, String username, String useraut, String useraddress, String usertelefono, String userrol);
    String actualizarUsuario(int id,String name, String username, String useraut, String useraddress, String usertelefono, String userrol);
    Integer eliminarUsuario(int id);
}
