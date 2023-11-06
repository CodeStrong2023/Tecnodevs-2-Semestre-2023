package Federico.Java.Clase_2;

import java.util.Scanner;

public class Federico_Ejercicio_1_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        
        while (number >= 0) {
            number = read(input);
            System.out.println(number + " al cuadrado es: " + (int)Math.pow(number, 2));
        }
    }

    public static int read(Scanner scanner) {
        System.out.println("Escribe un numero");
        return Integer.parseInt(scanner.nextLine());
    }
}
