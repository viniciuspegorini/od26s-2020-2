package br.edu.utfpr.pb.od26s.server.service.impl;

import br.edu.utfpr.pb.od26s.server.model.Categoria;
import br.edu.utfpr.pb.od26s.server.service.CategoriaService;
import br.edu.utfpr.pb.od26s.server.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl  extends CrudServiceImpl<Categoria, Integer>
		implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	protected JpaRepository<Categoria, Integer> getRepository() {
		return categoriaRepository;
	}

}
