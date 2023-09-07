
package ejemplo;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        String var = "Hola mundo";
        System.out.println("var");
        int var1 = 25;
        System.out.println(var1);
        if (var1 == 24)
                System.out.println("La variable es correcta");
        else
            System.out.println("No es correcto");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Asique tu nombre es: " + nombre);
                
    }
    
}
