
package Clase10Parte2Ejercicio3;

import java.util.Scanner;

public class Clase10Parte2Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        var resultado = 0;
        System.out.println("Ingrese dos números para trabajar: ");
        var numero1 = Integer.parseInt(entrada.nextLine());
        var numero2 = Integer.parseInt(entrada.nextLine());
        if (numero1 == numero2){
            resultado = numero1 * numero2;
            System.out.println("Los números se han multiplicado");
        }
        else if (numero1 > numero2){
            resultado = numero1 - numero2;
            System.out.println("Los números se han restado");
        }
        else {
            resultado = numero1 + numero2;
            System.out.println("Los números se han sumado");
        }
        System.out.println("El resultado de los números ingresados es: " + resultado);
    }
}