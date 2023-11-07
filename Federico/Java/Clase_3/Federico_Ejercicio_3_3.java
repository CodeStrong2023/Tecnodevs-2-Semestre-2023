package Federico.Java.Clase_3;

import java.util.Scanner;

public class Federico_Ejercicio_3_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number = (int) (Math.random()*100);

        System.out.println("Se ha generado un nuevo numero!");
        int guess = read(input);

        while (guess != number) {

            if (guess > number)
                System.out.println("Mas bajo!");
            else
                System.out.println("Mas alto!");

            guess = read(input);
            counter ++;
        }

        System.out.println("Le haz acertado! Intentos realizados: " + counter);
    }

    public static int read(Scanner scanner) {
        System.out.println("Escribe un numero");
        return Integer.parseInt(scanner.nextLine());
    }
}
