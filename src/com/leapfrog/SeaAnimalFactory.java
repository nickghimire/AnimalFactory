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
public class SeaAnimalFactory extends AnimalFactory {

    @Override
    public Animal getAnimal(String animalType) {
        Animal animal;
        animal = null;
        if ("shark".equals(animalType)) {
            animal = new Shark();
        } else if ("octupus".equals(animalType)) {
            animal = new Octupus();
        }
        return animal;
    }

}
