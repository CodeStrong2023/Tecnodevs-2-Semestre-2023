
package Clase10Parte2Ejercicio1;

import java.util.Scanner;

public class Clase10Parte2Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Sacamos el promedio de 3 exámenes y evaluamos"
                + " si el alumnos ha aprobado o desaprobado");
        System.out.println("Ingrese la primera nota: ");
        var nota1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese la segunda nota: ");
        var nota2 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese la tercera nota: ");
        var nota3 = Integer.parseInt(entrada.nextLine());
        System.out.println("Sus notas son: " + nota1 + ", " + nota2 + ", " + nota3 + ".");
        var promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("Su promedio es: " + promedio);
        if (promedio >= 7){
            System.out.println("APROBADO");
        }
        else if (promedio < 7){
            System.out.println("DESAPROBADO");
        }
        else{
            System.out.println("ERROR DE INGRESO");
        }
    }
}
