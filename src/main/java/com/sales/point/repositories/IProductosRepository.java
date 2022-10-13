package com.sales.point.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.point.models.Productos;

public interface IProductosRepository extends JpaRepository<Productos, Integer> {
    
}
