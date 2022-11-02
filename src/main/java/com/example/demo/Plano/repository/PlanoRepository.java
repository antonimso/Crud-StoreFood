package com.example.demo.Plano.repository;

import com.example.demo.Plano.model.Plano;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "plano", path = "planos")
public interface PlanoRepository extends PagingAndSortingRepository<Plano, Long> {

}
