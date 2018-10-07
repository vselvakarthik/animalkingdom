package com.singtel.digital;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.singtel.digital.service.Animal;
import com.singtel.digital.service.AnimalFactory;

public class AnimalReportSolution {

	public static void main(String[] args) {
		// Get all animals
		List<Animal> animals = Arrays.asList(AnimalFactory.createAll());
		// Flyable animals
		int flyableAnimals = animals.stream().filter(a -> a.canFly()).collect(Collectors.toList()).size();
		System.out.printf("Animals that can fly: %d\n", flyableAnimals);
		// Walkable animals
		int walkableAnimals = animals.stream().filter(a -> a.canWalk()).collect(Collectors.toList()).size();
		System.out.printf("Animals that can walk: %d\n", walkableAnimals);
		// Sing-able animals
		int singableAnimals = animals.stream().filter(a -> a.canSing()).collect(Collectors.toList()).size();
		System.out.printf("Animals that can sing: %d\n", singableAnimals);
		// Swim-able animals
		int swimableAnimals = animals.stream().filter(a -> a.canSwim()).collect(Collectors.toList()).size();
		System.out.printf("Animals that can swim: %d\n", swimableAnimals);
	}

}
