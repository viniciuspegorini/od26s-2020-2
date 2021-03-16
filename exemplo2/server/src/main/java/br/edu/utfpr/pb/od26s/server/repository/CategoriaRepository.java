package br.edu.utfpr.pb.od26s.server.repository;

import br.edu.utfpr.pb.od26s.server.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
