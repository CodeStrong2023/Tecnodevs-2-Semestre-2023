
package Ejercicio3Switch;

import java.util.Scanner;

public class Ejercicio3Switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la nota de su Examen: ");
        var examen = Integer.parseInt(entrada.nextLine());
        switch (examen){
            case 10: case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                System.out.println("F");
                break;
            default:
                System.out.println("Ingreso fuera de rango");
        }
    }
}
