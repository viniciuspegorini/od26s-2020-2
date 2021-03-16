package br.edu.utfpr.pb.od26s.server.repository;

import br.edu.utfpr.pb.od26s.server.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
