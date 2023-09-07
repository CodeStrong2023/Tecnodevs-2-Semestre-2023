
package Clase8MayorDeDosNumerosTernario;

import java.util.Scanner;

public class Clase8MayorDeDosNumerosTernario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        var num1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el segundo número: ");
        var num2 = Integer.parseInt(entrada.nextLine());
        var comparacion = (num1 > num2) ?  "El mayor es el PRIMER número "
                + "ingresado" : "El mayor es el SEGUNDO número ingresado";
        System.out.println(comparacion);
    }
}
