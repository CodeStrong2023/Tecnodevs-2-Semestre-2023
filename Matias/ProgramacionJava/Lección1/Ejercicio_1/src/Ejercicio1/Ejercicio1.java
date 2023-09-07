//Tienda de libros.
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);  
     /*
     La variable "entrada" es usada siempre que se quiere ingresar información
     desde el usuario. Es importante no olvidar primero CREAR Scanner e importar
     java.util.Scanner. Luego usamos la variable "entrada" y con el método
     nextLine, que manifiesta lo ingresado en la línea posterior.
     */
        System.out.println("Ingrese el nombre del libro: ");
        String nombreLibro = entrada.nextLine();
        System.out.println("Digite el id del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el precio del libro: $");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        System.out.println("Confirme si el envío es gratuito: ");
        boolean envioGratis = Boolean.parseBoolean(entrada.nextLine());
        /*
        Definimos el tipo de variable al principio y después "transformamos"
        las literales String que devuelve entrada. Así podemos trabajarlas
        de la forma que necesitemos.
        */
        System.out.println("");//Agrego espacio para que se vea ordenado.
        System.out.println("Libro: " + nombreLibro + " id #" + idLibro);
        //Concateno el símbolo numeral entre variables.
        System.out.println("Precio final $" + precioLibro);
        //Concateno el signo $.
        if (envioGratis == true){
            /*
            Realizo condicional "if" para dar un poco de libertad de respuesta
            en este punto.
            */
            System.out.println("El envío es GRATUITO");
        }
        else System.out.println("El precio del envío debe consultarse");
    }
}
