/*
Pedir números hasta que se teclee uno negativo.
Mostrar cuántos números se han introducido.
*/
package Ciclos04;

import java.util.Scanner;

public class Ciclos04 {
    public static void main(String[] args) {
        int numero, conteo = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0) {
            System.out.println("El número es positivo");
            conteo++;
            System.out.println("Digite otro número");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El número \"" + numero + "\" finaliza el programa");
        System.out.println("Ha ingresado \"" + conteo + "\" numero\\s que no son\\es negativo\\s");
    }
}
