package Federico.Java.Clase_4;

import java.util.Scanner;

public class Federico_Ejercicio_2_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = read(input);
        int total = 0;
        int counter = 0;
        
        while (number >= 0) {
            total += number;
            counter++;

            number = read(input);
        }

        if (counter != 0) // protector todo poderoso!
        System.out.println("El promedio es: " + total / counter);
    }

    public static int read(Scanner scanner) {
        System.out.println("Escribe un numero");
        return Integer.parseInt(scanner.nextLine());
    }
}
