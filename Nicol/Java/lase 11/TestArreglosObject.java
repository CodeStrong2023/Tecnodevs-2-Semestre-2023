package test;

import domain.Persona;


public class TestArreglosObject {
    
     public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        //Modificamos los valores de los elementos que estan en null
        personas[0] = new Persona("Jason");
        personas[1] = new Persona("Harry");
        System.out.println("personas 0: " + personas[0]);
        System.out.println("personas 1: " + personas[1]);
        //para iterar arreglos de tipo object
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas "+i+" = "+personas[i]);
        }
        
        String frutas[] = {"Naranja", "Limón", "Melón"};
        for(int i = 0; i < frutas.length; i++) {
            System.out.println("frutas "+i+" = " + frutas[i]);
        }
    }
}
