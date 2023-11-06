//Ejercicio 12: pedir un numero y calcular su factorial

import java.util.Scanner;

public class Ejercicios12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        long factorial = 1;
        System.out.println("Ingrese un numero es:");
        int numero = Integer.parseInt(entrada.nextLine());
        for( int i=1; i<=numero;i++){
            factorial *= i;
        }
        System.out.println("El factorial del numero ingresado es:"+factorial);
    }   
}
