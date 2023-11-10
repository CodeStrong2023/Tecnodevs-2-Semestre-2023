package servicios;

import modelos.Cuenta;
import modelos.Usuario;

import java.util.Random;
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

    public static int GenerarNumeroEntero(int digitos) {
        Random random = new Random();
        int minimo = (int)Math.pow(10, digitos - 1);
        int maximo = (int)Math.pow(10, digitos) - 1;

        return minimo + random.nextInt(maximo - minimo + 1);
    }

    public static void Separar() {
        System.out.println("--- --- --- --- ---");
    }
    public static void Pausar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.next();
    }
}
