package com.example.demo.foodstore.repository;

import com.example.demo.foodstore.model.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "produto", path = "produtos")
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Long> {

}
