/*
Ejercicio 3: Leer 5 números por teclado, almacenarlos en un
arreglo y, a continuación, realizar la media de los números
positivos, la media de los negativos y contar el número de
ceros.
 */
package arreglos_ejercicio_3;

import java.util.Scanner;

public class Arreglos_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];
        float suma_positivos=0, suma_negativos=0,media_positivos,media_negativos;
        int conteo_positivos=0, conteo_negativos=0;
        int conteo_ceros = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese " +(i+1)+"° número: ");
            numeros[i] = entrada.nextFloat();
            if (numeros[i]<0){
                suma_negativos += numeros[i];
                conteo_negativos++;
            } else if (numeros[i] > 0) {
                suma_positivos += numeros[i];
                conteo_positivos++;
            } else {
                conteo_ceros++;
            }
        }
            media_negativos = suma_negativos / conteo_negativos;
            media_positivos = suma_positivos / conteo_positivos;
            
            System.out.println("La media de números positivos es de "+media_positivos+ " - Mientras que la media de números negativos es de "+media_negativos+" - La cantidad de ceros ingresados es de "+ conteo_ceros);
    }
}
