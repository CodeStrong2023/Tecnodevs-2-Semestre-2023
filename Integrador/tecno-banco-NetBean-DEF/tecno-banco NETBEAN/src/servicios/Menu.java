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
        String entrada;
        do {
            Sistema.Separar();
            MostrarTitulo();
            MostrarMenu();
            MostrarControles();
            entrada = scanner.nextLine().toLowerCase();

            // Procesa la entrada para 'w' y 's'
            for (char ch : entrada.toCharArray()) {
                switch (ch) {
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
            }

            for (int i = 0; i < opciones.length; i++) {
                if (entrada.equalsIgnoreCase(opciones[i])) {
                    opcionElegida = i;
                    return opcionElegida;
                }
            }

        } while (entrada.chars().allMatch(ch -> ch == 'w' || ch == 's'));

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