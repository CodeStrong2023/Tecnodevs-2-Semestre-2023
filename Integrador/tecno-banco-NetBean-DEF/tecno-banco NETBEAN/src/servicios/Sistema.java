package servicios;

import modelos.Cuenta;
import modelos.Usuario;

import java.util.Scanner;

public class Sistema {
    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
            Sistema.usuario = usuario;
    }

    public static Cuenta getCuenta() {
        return Sistema.getUsuario().cuenta;
    }

    public static Usuario usuario;

    public static void Separar() {
        System.out.println("--- --- --- --- ---");
    }
    public static void Pausar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.next();
    }
}
