package Federico.Java.Clase_6;

import java.util.Scanner;

public class Federico_Ejercicio_1_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int total = 0;
        
        for (int i = 0; i < 10; i++) {
            number = read(input);
            total += number;
        }

        System.out.println("Total: " + total);
    }

    public static int read(Scanner scanner) {
        System.out.println("Escribe un numero");
        return Integer.parseInt(scanner.nextLine());
    }
}
