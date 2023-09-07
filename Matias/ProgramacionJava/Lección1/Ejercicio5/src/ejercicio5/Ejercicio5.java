
package ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {

    public static void main(String[] args) {
        Float nota1,nota2,nota3,sumaDeNotas,promedioExamenes;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las últimas 3 notas que recibió");
        nota1 = Float.parseFloat(entrada.nextLine());
        nota2 = Float.parseFloat(entrada.nextLine());
        nota3 = Float.parseFloat(entrada.nextLine());
        sumaDeNotas = nota1 + nota2 + nota3;
        System.out.println("La suma de sus notas es " + sumaDeNotas);
        promedioExamenes = sumaDeNotas / 3;
        System.out.println("Su promedio es " + promedioExamenes);
        //Añado el promedio de notas.
    }
    
}
