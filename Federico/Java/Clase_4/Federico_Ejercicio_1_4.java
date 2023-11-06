package Federico.Java.Clase_4;

import java.util.Scanner;

public class Federico_Ejercicio_1_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int total = 0;
        
        do {
            number = read(input);
            total += number;
        }
        while (number != 0);

        System.out.println("El total es: " + total);
    }

    public static int read(Scanner scanner) {
        System.out.println("Escribe un numero");
        return Integer.parseInt(scanner.nextLine());
    }
}
