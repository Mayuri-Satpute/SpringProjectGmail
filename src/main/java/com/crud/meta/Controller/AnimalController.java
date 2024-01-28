package com.crud.meta.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.meta.Service.AnimalService;
import com.crud.meta.modelled.Animal;

@RestController
public class AnimalController {
	
    @Autowired
    private AnimalService animalservice;
    
    	@GetMapping("/details")
    	public List<Animal> getAllAnimal()
    	{    	
    		return  animalservice.getAllAnimal();
    	}
    	
    	@PostMapping("/post")
    	public 
    }

