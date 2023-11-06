package Federico.Java.Clase_3;

import java.util.Scanner;

public class Federico_Ejercicio_1_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = read(input);

        
        while (number != 0) {
            String result = "impar";
            if (number % 2 == 0) result = "par";
            System.out.println("El numero ingresado es: " + result);
            number = read(input);
        }
    }

    public static int read(Scanner scanner) {
        System.out.println("Escribe un numero");
        return Integer.parseInt(scanner.nextLine());
    }
}
