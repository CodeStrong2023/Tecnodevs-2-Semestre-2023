
package Clase10Parte2Ejercicio2;

import java.util.Scanner;

public class Clase10Parte2Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el monto de la compra realizada: ");
        var compra = Float.parseFloat(entrada.nextLine());
        var descuento = compra * 0.2;
        var precioFinal = compra - descuento;
        if (compra > 100){
            System.out.println("Su compra tiene un descuento de: $" + descuento);
            System.out.println("El precio final de su compra es de: $" + precioFinal);
        }
        else if (compra < 100 && compra > 0){
            System.out.println("El monto de su compra es de: $" + compra);
            System.out.println("Recuerde que haciendo una compra superior a $100"
                    + " usted obtendrá un descuento del 20%.");
        }
        else{
            System.out.println("Usted no ha realizado ninguna compra");
        }
    }
}
