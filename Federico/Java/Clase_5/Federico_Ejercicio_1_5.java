package Federico.Java.Clase_5;

import java.util.Scanner;

public class Federico_Ejercicio_1_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = read(input);
        int n = 1;
        
        while (n <= number) {
            System.out.println("*- " + n);
            n++;
        } 
    }

    public static int read(Scanner scanner) {
        System.out.println("Escribe un numero");
        return Integer.parseInt(scanner.nextLine());
    }
}
