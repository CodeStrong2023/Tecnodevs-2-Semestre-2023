// Ejercicio 3: Leer numero hasta que se coloque cero.
//Para cada uno indicar si es par o impar.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero != 0){
            if(numero % 2 == 0){
                System.out.println("El numero "+numero+" es PAR");
            }
            else{
                System.out.println("El numero "+numero+" es IMPAR");
            }
           System.out.println("Ingrese otro numero");
        numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El numero "+numero+" finaliza el programa");
    }
}
