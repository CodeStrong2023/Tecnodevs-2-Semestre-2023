/*
Realizar un juego para adivinar un número,
para ello generar un número aleatorio del 1-100
y luego ir pidiendo números respondiendo si es mayor
o menor que el número N.
 */
package Ciclos05;

import java.util.Scanner;

public class Ciclos05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100);   // Esto genera un número aleatorio (de 100)
        do {
            System.out.println("Digite un número");
            numero = Integer.parseInt(entrada.nextLine());
            if (numero < aleatorio) {
                System.out.println("El número \"" + numero + "\" es menor");
            }
            else if (numero > aleatorio) {
                System.out.println("El número \"" + numero + "\" es mayor");
            }
            else {
                System.out.println("FELICIDADES! Adivinaste el número!");
            }
            conteo++;
        } while(numero != aleatorio);
        System.out.println("Lo ha adivinado en \"" + conteo + "\" intentos");
    }
}
    
