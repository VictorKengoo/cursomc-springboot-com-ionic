package com.udemy.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.cursomc.domain.Categoria;
import com.udemy.cursomc.repositories.CategoriaRepository;
import com.udemy.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public Categoria buscar(Integer id){
		Categoria categoria = repository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException(
						"Objeto não encontrado!!" +
						"\nId: " + id +
						"\nTipo: " + Categoria.class.getName()));
		return categoria;
	}
}
