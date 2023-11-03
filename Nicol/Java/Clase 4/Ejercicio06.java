/*Ejercicio 6: Pedir numeros hasta que se teclee un cero,
mostrar la suma de todos los numeros introducidos.
*/

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros,suma = 0;
        do{
            System.out.println("Digite un numero: ");
            numeros = Integer.parseInt(entrada.nextLine());
            suma+= numeros;
        }while(numeros != 0);
        System.out.println("La suma de todos los numeros ingresados es "+suma);
    }
}
