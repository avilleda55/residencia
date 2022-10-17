package com.sales.point.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.point.models.DetalleStock;

public interface IDetalleStockRepository extends JpaRepository<DetalleStock,Integer>{
    
}
