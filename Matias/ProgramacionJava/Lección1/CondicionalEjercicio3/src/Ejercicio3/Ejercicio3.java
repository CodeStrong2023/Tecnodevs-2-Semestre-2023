
package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nota");
        var examen = Integer.parseInt(entrada.nextLine());
        if(examen <= 10 && examen >= 9){
            System.out.println("A");
        }
        else if (examen <= 9 && examen >=8){
            System.out.println("B");
        }
        else if (examen <= 8 && examen >= 7){
            System.out.println("C");
        }
        else if (examen <= 7 && examen >= 6){
            System.out.println("D");
        }
        else if (examen <= 5 && examen >= 0){
            System.out.println("F");
        }
        else
            System.out.println("Ingreso fuera de rango");
        
    }
}
