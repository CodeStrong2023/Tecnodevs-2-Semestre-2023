
package Leccion2;

import java.util.Scanner;


public class Leccion2 {
    public static void main(String[] args) {
//        var condicion = true;
//                if (condicion){
//                    System.out.println("Es verdadera");
//                }
//                else {
//                    System.out.println("Es Falsa");
//                }
//                
//    var numero = 4;
//    var numeroTexto = "";
//    if (numero == 1) {
//        numeroTexto = "número uno";
//    }
//    else if (numero == 2) {
//        numeroTexto = "número dos";
//    }
//    else if (numero == 3){
//        numeroTexto = "número tres";
//    }
//    else if (numero == 4) {
//        numeroTexto = "número cuatro";
//    }
//    else {
//        System.out.println("El número no ha sido encontrado");
//    }
//        System.out.println("numeroTexto: " + " - " + numeroTexto);

        var numero = 2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 4");
        numero = Integer.parseInt(entrada.nextLine());
        var numeroTexto = "no determinado";
        switch (numero){
            case 1: 
                numeroTexto = "número uno";
                break;
            case 2:
                numeroTexto = "número dos";
                break;
            case 3:
                numeroTexto = "número tres";
                break;
            case 4:
                numeroTexto = "número cuatro";
                break;
            default:
                numeroTexto = "no encontrado dentro del rango";
        }
        System.out.println("El número ingresado \"" + numero + "\""
                + " es: " + numeroTexto);
        
                
    } 
}
