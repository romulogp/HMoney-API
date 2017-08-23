package br.com.hustik.hmoney.api.repository;

import br.com.hustik.hmoney.api.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
