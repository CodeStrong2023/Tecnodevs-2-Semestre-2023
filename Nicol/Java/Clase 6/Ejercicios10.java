package Ejercicio1;

//Ejercicio 10: Pedir 10 numeros y escribir la suma total.

import java.util.Scanner;

public class Ejercicios10 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        int numero, suma = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite un numero:");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        }
        System.out.println("La suma de todos los numeros es: "+suma);
        
    }
}
