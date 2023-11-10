package test;

import java.util.Arrays;


public class TestArreglos {
    public static void main(String[] args) { 
        
        int edades[] = new int [3]; 
        
        System.out.println("edades = " + Arrays.toString(edades));
        
        //Para modificar elementos del arreglo de a uno:
        edades[0] = 17;
        //Tarea
        edades[1] = 12; 
        edades[2] = 15;
        //edades[3] = 10; //fuera de rango, error en tiempo de ejecución
        System.out.println("edades 0 = " + edades[0]);
        //Tarea
        System.out.println("edades 1 = " + edades[1]); 
        System.out.println("edades 2 = " + edades[2]);

        
        for(int i = 0; i < edades.length; i++){
            System.out.println("Edades y sus elementos "+i+": "+edades[i]);
                                     
        }        

    }
}