package com.producto.service.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.fm.app.entity.Producto;
import com.sistema.fm.app.repository.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository ProductoRepositorio;

	public List<Producto> getAll(){
		return ProductoRepositorio.findAll();
	}
	
	public Producto getProductoById(int id) {
		return ProductoRepositorio.findById(id).orElse(null);

	}
	
	public Producto save(Producto producto) {
		Producto nuevoProducto = ProductoRepositorio.save(producto);
		return nuevoProducto;
	}

	public Producto obtenerProductoPorId1(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Producto eliminarProducto(Producto producto) {
		return producto;
		// TODO Auto-generated method stub
		
	}

	public List<Producto> obtenerProducto() {
		// TODO Auto-generated method stub
		return null;
	}

	public Producto guardarProducto1(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	public Producto guardarProducto(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Producto obtenerProductoPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Producto> obtenerProducto1() {
		// TODO Auto-generated method stub
		return null;
	}

	public Producto obtenerProductoPorId11(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}


