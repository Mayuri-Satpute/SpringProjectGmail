package com.crud.meta.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.meta.info.AnimalRepositary;
import com.crud.meta.modelled.Animal;

@Service
public class AnimalService {
  
	@Autowired
	private AnimalRepositary   animalrepositary;
	
	public List<Animal> getAllAnimal()
	{
		return animalrepositary.findAll();
	}
			
}
