package test;

import domain.Persona;
import java.util.Arrays;


public class TestMatrices {
      public static void main(String[] args) {
        int edades[][] = new int[3][2];
         System.out.println("edades: " + Arrays.toString(edades));
        edades[0][0] = 5; //Llenamos manualmente la matriz
        edades[0][1] = 7; //Es una diferente columna
        edades[1][0] = 8;
        edades[1][1] = 4;
        
        edades[2][0] = 1;
        edades[2][1] = 0;
        
        //Mostramos por consola la matriz
          System.out.println("edades 0-0 = " + edades[0][0]);
          System.out.println("edades 0-1 = " + edades[0][1]);
          System.out.println("edades 1-0 = " + edades[1][0]);
          System.out.println("edades 1-1 = " + edades[1][1]);
          System.out.println("edades 2-0 = " + edades[2][0]);
          System.out.println("edades 2-1 = " + edades[2][1]);
        
         for (int fila = 0; fila < edades.length; fila++){
             for (int col = 0; col < edades[fila].length; col++) {
                 System.out.println("edades " +fila + "-"+col+": "+edades[fila][col]);
             }
         }

         String frutas[][] = {{"Manzana", "Naranja"},{"Mandrina", "Kiwi"},{"Anana","Pera"}};
         imprimir(frutas);


         Persona personas[][] = new Persona[2][3];
         personas[0][0] = new Persona("Ariel");
         personas[0][1] = new Persona("Osvaldo");
         personas[0][2] = new Persona("Mariela");
         personas[1][0] = new Persona("Carlos");
         personas[1][1] = new Persona("Romina");
         personas[1][2] = new Persona("Uriel");
         imprimir(personas);
         
    }
      
      
      public static void imprimir(Object matriz[][]){
           for (int i = 0; i < matriz.length; i++){
             for (int j = 0; j < matriz[i].length; j++) {
                 System.out.println("Matriz " +i + "-"+j+": "+matriz[i][j]);
             }
         }
      }
}