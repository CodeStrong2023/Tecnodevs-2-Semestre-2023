/*
Ejercicio 2: Leer 5 números, guardarlos en un arreglo y mostrarlos
en el orden inverso al introducirlos
 */
package arreglos_ejercicio_2;

import java.util.Scanner;

public class Arreglos_Ejercicio_2 {
    public static void main(String[] args) {
        float numeros[] = new float[5];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca "+(i+1)+"° número: ");
            numeros[i] = entrada.nextFloat();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println("numeros indice"+i+" = "+numeros[i]);

        }
    }
}
