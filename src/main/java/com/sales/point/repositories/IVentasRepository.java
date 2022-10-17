package com.sales.point.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.point.models.Venta;

public interface IVentasRepository extends  JpaRepository<Venta, Integer>{



}
