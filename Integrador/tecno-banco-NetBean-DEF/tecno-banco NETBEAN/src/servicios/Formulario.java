package servicios;

import java.util.Scanner;

public class Formulario {
    private final Scanner scanner = new Scanner(System.in);

    public String PreguntarPalabra(String pregunta) {
        String respuesta;
        while (true) {
            System.out.println("* " + pregunta);
            if (scanner.hasNext()) {
                respuesta = scanner.next();
                scanner.nextLine(); // Limpiar el buffer
                return respuesta;
            } else {
                System.out.println("Por favor, ingrese una palabra válida.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
    }

    public int PreguntarNumeroEntero(String pregunta) {
        int respuesta;
        while (true) {
            System.out.println("* " + pregunta);
            if (scanner.hasNextInt()) {
                respuesta = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                return respuesta;
            } else {
                System.out.println("Por favor, ingrese un número entero válido.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
    }

    public float PreguntarNumero(String pregunta) {
        float respuesta;
        while (true) {
            System.out.println("* " + pregunta);
            if (scanner.hasNextFloat()) {
                respuesta = scanner.nextFloat();
                scanner.nextLine(); // Limpiar el buffer
                return respuesta;
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
    }
}
