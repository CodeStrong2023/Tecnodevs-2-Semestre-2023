//Ejercicio 2: leer 5 numeros, guardarlos en un arreglo y mostrarlos en el orden
// inverso al introducirlos.

package Java.Leccion9;

import java.util.Scanner;

public class Arreglos_Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];

        System.out.println("Guardando los elementos en el arreglo");
        for(int i=0;i<5;i++){
            System.out.println((i+1)+". Coloque un numero: ");
            numeros[i] = entrada.nextFloat();
        }

        System.out.println("\nImprimir los elementos del arreglo");
        for(float i=4;i>=0;i--){
            System.out.println(i+" ");
        }   

        System.out.println("\n");
    }
}
