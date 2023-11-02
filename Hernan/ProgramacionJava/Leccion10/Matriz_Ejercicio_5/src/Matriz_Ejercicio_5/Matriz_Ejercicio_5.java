/*
Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la suma
de cada fila y de cada columna.
 */
package Matriz_Ejercicio_5;

import java.util.Scanner;

public class Matriz_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int filas;
        int columnas;
        
        int sumaFilas;
        int sumaColumna;
        
        int posFila;
        int posColumna;
        
        System.out.println("Ingrese el número de filas");
        filas = entrada.nextInt();
        System.out.println("Ingrese el número de columnas");
        columnas = entrada.nextInt();
        
        int matriz[][] = new int[filas][columnas];
        // Llenado de matriz
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Ingrese número para la posición "+i+j+": ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        // Muestra matriz original
        System.out.println("\nLa matriz ingresada es la siguiente: ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
        // Suma Filas
        posFila = 0;
        int filasArreglo[] = new int[filas];
        
        
        for (int i = 0; i < filas; i++){
            sumaFilas = 0;
            for (int j = 0; j < columnas; j++){
                sumaFilas += matriz[i][j];
            }
            filasArreglo[posFila] = sumaFilas;
            posFila++;
        }
        // Suma Columnas
        posColumna = 0;
        int columnaArreglo[] = new int[columnas];
        
        
        for (int i = 0; i < filas; i++){
            sumaColumna = 0;
            for (int j = 0; j < columnas; j++){
                sumaColumna += matriz[j][i];
            }
            columnaArreglo[posColumna] = sumaColumna;
            posColumna++;
        }
        // Muestra sumas
        System.out.println("\nLa suma de las filas es: ");
        for (int i = 0; i < filasArreglo.length;i++){
            System.out.println(filasArreglo[i]);
        }
        System.out.println("\nLa suma de las columnas es: ");
        for (int i = 0; i < columnaArreglo.length;i++){
            System.out.print(columnaArreglo[i]);
        }
        System.out.println();
    }
    
}
