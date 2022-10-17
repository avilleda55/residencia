package com.sales.point.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.point.models.Categoria;

public interface ICategoriasRepository extends JpaRepository<Categoria,Integer> {
    
}
