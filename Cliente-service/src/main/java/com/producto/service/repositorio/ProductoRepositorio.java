package com.producto.service.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.fm.app.entity.Producto;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{

	List<Producto> findByUsuarioId(int usuarioId);
	
}
