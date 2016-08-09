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
public abstract class AnimalFactory 
{
    public abstract Animal getAnimal(String animalType);

    public  static AnimalFactory getAnimalFactory(String factoryType) 
    {
        AnimalFactory animalFactory = null;
        if ("sea".equals(factoryType)) {
            animalFactory = new SeaAnimalFactory();
        } else {
            animalFactory = new LandAnimalFactory();
        }
        return animalFactory;
    }

}
