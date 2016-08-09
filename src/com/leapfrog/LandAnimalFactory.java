/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog;

/**
 *
 * @author apple
 */
public class LandAnimalFactory extends AnimalFactory {

    @Override
    public Animal getAnimal(String animalType) {
        Animal animal = null;
        if ("dog".equals(animalType)) {
            animal = new Dog();
        } else if ("cat".equals(animalType)) {
            animal = new Cat();
        } else if ("lion".equals(animalType)) {
            animal = new Lion();

        }
        return animal;
    }

}
