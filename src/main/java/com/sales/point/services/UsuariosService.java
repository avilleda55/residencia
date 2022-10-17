package com.sales.point.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.point.models.Usuario;
import com.sales.point.repositories.IUsuariosRepository;

@Service
public class UsuariosService implements IUsuariosService {
    
    @Autowired
    private IUsuariosRepository _iusuario;


    @Override
    public List<Usuario> getUsuarios() {
        
        try{
            List<Usuario> listaProductos =  new ArrayList<>();
            listaProductos = _iusuario.findAll();
            return listaProductos;

        }catch(Exception e){
            System.out.println("+++"+e.getMessage());
            return null;
        }
    }

    @Override
    public Usuario getUsuario(int id) {
    
        try{
            Usuario usuario = _iusuario.findById(id).get();
            return usuario;

        }catch(Exception e){
            System.out.println("****"+e.getMessage());
            return null;
        }
    }

    @Override
    public Usuario agregarUsuario(String name, String username, String useraut, String useraddress, String usertelefono, String userrol) {
        try {
            Usuario nuevo = new Usuario();
            nuevo.setName(name);
            nuevo.setUsername(username);
            nuevo.setUseraut(useraut);
            nuevo.setUseraddress(useraddress);
            nuevo.setUsertelefono(usertelefono);
            nuevo.setUserrol(userrol);
            Usuario usuario  = _iusuario.saveAndFlush(nuevo);
            return usuario;
        } catch (Exception e) {
            System.out.println("+++"+e.getMessage());
            return null;
        }
    }

    @Override
    public String actualizarUsuario(int id,String name, String username, String useraut, String useraddress, String usertelefono, String userrol) {
        
        try {
            Usuario modificado = _iusuario.findById(id).get();
            modificado.setName(name);
            modificado.setUsername(username);
            modificado.setUseraut(useraut);
            modificado.setUseraddress(useraddress);
            modificado.setUsertelefono(usertelefono);
            modificado.setUserrol(userrol);
             _iusuario.saveAndFlush(modificado);
            return "Modificado";
        } catch (Exception e) {
            System.out.println("+++"+e.getMessage());
            return "Error en la actualizacion";
        }
    }

    @Override
    public Integer eliminarUsuario(int id) {
       
        return null;
    }

}
