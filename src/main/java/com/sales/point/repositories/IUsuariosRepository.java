package com.sales.point.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.point.models.Usuario;

public interface IUsuariosRepository extends JpaRepository<Usuario, Integer>{
    
}
