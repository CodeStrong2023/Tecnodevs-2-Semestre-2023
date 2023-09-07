/*
Leer un número e indicar si es Positivo o Negarivo. El programa finaliza
al digitar el número 0.
 */
package Ciclos02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número");
        var numero = Integer.parseInt(entrada.nextLine());
        while(numero != 0) {
            if(numero < 0) {
                System.out.println("El número "+numero+" es negativo");
                System.out.println("Digite otro número");
                numero = Integer.parseInt(entrada.nextLine());
            }
            else {
                System.out.println("El número "+numero+" es positivo");
                System.out.println("Digite otro número");
                numero = Integer.parseInt(entrada.nextLine());
            }
        }
        System.out.println("El número "+numero+" finaliza el programa");
    }
}
