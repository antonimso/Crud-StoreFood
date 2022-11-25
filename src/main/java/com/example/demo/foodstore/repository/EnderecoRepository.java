package com.example.demo.foodstore.repository;

import com.example.demo.foodstore.model.Endereco;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "enredeco", path = "enredecos")
public interface EnderecoRepository extends PagingAndSortingRepository<Endereco, Long> {

}
