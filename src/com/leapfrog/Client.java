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
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Animal animal =null;
     AnimalFactory animalFactory =null;
     String speakSound =null;
     
     
       // Get Factory object by passing the factory type
        animalFactory = AnimalFactory.getAnimalFactory("sea");
        System.out.println("Animal Factory type:" + animalFactory.getClass().getName());
    
        System.out.println();
    
    // Get Animal object by passing the animal type
    
        animal = animalFactory.getAnimal("shark");
        System.out.println("Animal Type" + animal.getClass().getName());
        speakSound =animal.speak();
        System.out.println("shark speak:"+ speakSound);
        System.out.println();
        
        animal = animalFactory.getAnimal("Octupus");
        System.out.println("Animal Type :" + animal.getClass().getName());
        speakSound =animal.speak();
        System.out.println("Octupus speak :"+speakSound);
        
        System.out.println("---------------------------------------");

        //Get Factory by passing the factory type
        
        
        animalFactory =AnimalFactory.getAnimalFactory("Land");
        System.out.println("Animal Factory type : " +animalFactory.getClass().getName());
        System.out.println();
        
        // Get Animal object by passing the animal type
        
        animal = animalFactory.getAnimal("dog");
        System.out.println("Animal type :"+ animal.getClass().getName());
        speakSound = animal.speak();
        System.out.println("Dog speak"+speakSound);
        System.out.println();
        
        animal= animalFactory.getAnimal("cat");
        System.out.println("Animal type :" + animal.getClass().getName());
        speakSound=animal.speak();
        System.out.println("cat speak : "+speakSound);
        System.out.println();
        
        animal= animalFactory.getAnimal("lion");
        System.out.println("Animal type :"+ animal.getClass().getName());
        speakSound=animal.speak();
        System.out.println("lion speaks : "+ speakSound);
        
                
    }
    
}
