package servicios;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final String[] opciones;
    private String titulo = "TecnoBanco";
    private int opcionElegida = 0;

    public Menu(String[] opciones) {
        this.opciones = opciones;
    }
    public Menu(String[] opciones, String titulo) {
        this.titulo = titulo;
        this.opciones = opciones;
    }

    public int Iniciar() {
        char entrada;
        do {
            Sistema.Separar();
            MostrarTitulo();
            MostrarMenu();
            MostrarControles();
            entrada = scanner.next().charAt(0);
            switch (entrada) {
                case 'w':
                    if (opcionElegida == 0) {
                        opcionElegida = opciones.length - 1;
                    } else {
                        opcionElegida--;
                    }
                    break;
                case 's':
                    if (opcionElegida == opciones.length - 1) {
                        opcionElegida = 0;
                    } else {
                        opcionElegida++;
                    }
                    break;
            }
        } while (entrada == 'w' || entrada == 's');

        return opcionElegida;
    }

    private void MostrarTitulo() {
        System.out.println(titulo);
    }

    private void MostrarMenu() {
        for (int i = 0; i < opciones.length; i++) {
            if (i == opcionElegida) {
                System.out.println("* " + opciones[i]);
            } else {
                System.out.println("  " + opciones[i]);
            }
        }
    }

    private void MostrarControles() {
        System.out.println("w+ | s- | Cualquier tecla para seleccionar");
    }
}