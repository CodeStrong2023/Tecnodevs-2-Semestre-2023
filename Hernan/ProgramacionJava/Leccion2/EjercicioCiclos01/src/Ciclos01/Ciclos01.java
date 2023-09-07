/*
Leer un número y mostrar su cuadrado. Repetir hasta que se digite un número
negativo.
*/
package Ciclos01;

import java.util.Scanner;

public class Ciclos01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cuadrado;
        System.out.println("Ingrese un número");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0) {
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El número "+numero+" elevado al cuadrado es: "+cuadrado);
            System.out.println("Ingrese otro número");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El ingreso de "+numero+" finaliza el programa");
    }
}
