package com.idat.SeptiembreIIIE.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.SeptiembreIIIE.model.Producto;


@Repository
public interface ProductoRepository extends JpaRepository <Producto, Integer> {

	
	
}
