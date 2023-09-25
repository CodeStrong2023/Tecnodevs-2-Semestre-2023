/*
 Ejercicio 8: Pedir un número y mostrar todos los números desde 1 hasta
el número N
 */
package Ciclos08;

import java.util.Scanner;

public class Ciclos08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número para finalizar el conteo: ");
        int numero = Integer.parseInt(entrada.nextLine());
        int i = 1;
        while (i <= numero) {
            System.out.println(i);
            i ++;
        }
    }
}
