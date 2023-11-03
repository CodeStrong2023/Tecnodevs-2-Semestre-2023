/*
Ejercicio 4: Crear una matriz de 7x7 y rellenarla de forma que los elementos
de la diagonal sean uno y el resto ceros
 */
package Matriz_Ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Matriz_Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[7][7];
        
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                if (i == j){
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                    System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
