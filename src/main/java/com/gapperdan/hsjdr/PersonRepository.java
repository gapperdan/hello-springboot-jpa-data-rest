package com.gapperdan.hsjdr;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
//@RepositoryRestResource(collectionResourceRel = "people", path = "people") //override the default path 'persons'
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

	List<Person> findByLastName(@Param("name") String name);
  List<Person> findByFirstName(@Param("name") String name);

}
