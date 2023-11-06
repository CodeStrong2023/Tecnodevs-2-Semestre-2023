package Federico.Java.Clase_5;

import java.util.Scanner;

public class Federico_Ejercicio_2_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = read(input, 30, "dia");
        int month = read(input, 12, "mes");
        int year = read(input, "anio");

        System.out.println("Has ingresado: " + day + "/" + month + "/" + year);
    }

    public static int read(Scanner scanner, int limit, String label) {
        int number = 0;

        do {
            System.out.println("Escribe un " + label);
            number = Integer.parseInt(scanner.nextLine());
        } while (number <= 0 || number > limit);

        return number;
    }

    public static int read(Scanner scanner, String label) {
        System.out.println("Escribe un " + label);
        return Integer.parseInt(scanner.nextLine());
    }
}
