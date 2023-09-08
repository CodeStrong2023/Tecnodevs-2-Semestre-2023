/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo
y calcular el promedio
*/
package Ciclos07;

import java.util.Scanner;

public class Ciclos07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        System.out.println("Introduzca un número ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) { //Mientras el número sea positvo o cero
            suma += numero;
            conteo++;
            System.out.println("Introduzca otro número ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if (conteo == 0) {
            System.out.println("\n Error, la división entre cero no existe");
        }
        else {
            promedio = (float)suma / conteo;
            System.out.println("\n El promedio de los números in4-gresados es: " + promedio);
        }
    }
}
