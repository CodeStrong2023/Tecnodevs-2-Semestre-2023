// Ejercicio 4: Pedir numeros hasta que se tecree uno negativo, y
//mostrar cuantos numeros se han introducido.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero, conteo = 0;
        System.out.println("Ingrese un numero");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
            System.out.println("El numero "+numero+" es POSITIVO");
            conteo++;
            System.out.println("Coloque otro numero");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("A ingresado "+conteo+" numero que no son negativos");
    }   
}