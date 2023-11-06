package Federico.Java.Clase_2;

import java.util.Scanner;

public class Federico_Ejercicio_2_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = read(input);

        
        while (number != 0) {
            String result = "negativo";
            if (number > 0) result = "positivo";
            System.out.println("El numero ingresado es: " + result);
            number = read(input);
        }
    }

    public static int read(Scanner scanner) {
        System.out.println("Escribe un numero");
        return Integer.parseInt(scanner.nextLine());
    }
}
