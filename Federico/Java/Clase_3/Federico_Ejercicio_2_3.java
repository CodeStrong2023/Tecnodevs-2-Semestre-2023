package Federico.Java.Clase_3;

import java.util.Scanner;

public class Federico_Ejercicio_2_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int total = 0;
        
        while (number >= 0) {
            number = read(input);
            if (number > 0)
                total += number;
        }

        System.out.println("El total es: " + total);
    }

    public static int read(Scanner scanner) {
        System.out.println("Escribe un numero");
        return Integer.parseInt(scanner.nextLine());
    }
}
