/*
Ejercicio 1: Leer 5 números, guardarlos en un arreglo y mostrarlos
en el mismo orden introducido
 */
package arreglos_ejercicio_1;

import java.util.Scanner;

public class Arreglos_Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numeros[] = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduza el número en posición "+(i+1));
            //numeros[i] = Integer.parseInt(entrada.nextLine());
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
        //for (int i:numeros){ Se pasa de índic
            System.out.println("numeros posición "+i+" = "+ numeros[i]);
        }
    }
}
