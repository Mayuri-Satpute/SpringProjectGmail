package com.crud.meta.info;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.crud.meta.modelled.Animal;

@RestController
public interface AnimalRepositary  extends JpaRepository<Animal,Long>{

	
	
}
