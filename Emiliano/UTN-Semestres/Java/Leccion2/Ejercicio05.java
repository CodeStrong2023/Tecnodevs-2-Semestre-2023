/* Ejercicio 5: Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100, y 
luego ir pidiendo numeros indicando "es mayor" o
"es menos" segun sea mayor o menor con respecto a N
El proceso termina cuando el usuario acierta y mostramos
el numero de intentos hechos.
*/

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100); // Esto genera un numero aleatorio
        do{
            System.out.println("Coloque un número: ");
            numero = Integer.parseInt(entrada.nextLine());
            if(numero < aleatorio){
                System.out.println("Es un número mayor ");
            }
            else if(numero > aleatorio){
                System.out.println("Es un número menor ");
            }
            else{
                System.out.println("\t¡¡FELICIDADES!! Has adivinado el número ");
                System.out.println("");
            }
            conteo++;
        }while(numero != aleatorio);
        System.out.println("\tAdivinaste el número en "+conteo+" intentos");
        System.out.println("");
    }
}
