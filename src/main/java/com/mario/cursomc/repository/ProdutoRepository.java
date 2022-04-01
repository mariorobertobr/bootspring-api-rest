package com.mario.cursomc.repository;

import com.mario.cursomc.domain.Categoria;
import com.mario.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
