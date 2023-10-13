package servicios;

import java.util.Scanner;

public class Formulario {
    private final Scanner scanner = new Scanner(System.in);

    public String PreguntarPalabra(String pregunta) {
        System.out.println("* " + pregunta);

        return scanner.next();
    }

    public int PreguntarNumeroEntero(String pregunta) {
        System.out.println("* " + pregunta);

        return scanner.nextInt();
    }

    public float PreguntarNumero(String pregunta) {
        System.out.println("* " + pregunta);
        return scanner.nextFloat();
    }
}
