package datos;

import modelos.Usuario;

import java.util.Arrays;
import java.util.Random;

public class Usuarios {
    private final static String[][] ListaDeCredenciales = new String[][] {
            {"Federico", "matear23"},
            {"Eugenia", "chamuyo45"},
            {"Martin", "asado67"},
            {"Tomas", "milonga89"},
            {"Clara", "tango01"},
            {"Angela", "golazo12"},
            {"Lucas", "futbol34"}
    };

    public static Usuario[] ListaDeUsuarios;

    public static void Iniciar() {
        ListaDeUsuarios = new Usuario[ListaDeCredenciales.length];
        Random random = new Random();

        for (int i = 0; i < ListaDeCredenciales.length; i++) {
            float balanceInicial = random.nextFloat() * 2000;
            int dniAleatorio = 10000000 + random.nextInt(90000000);
            ListaDeUsuarios[i] = new Usuario(ListaDeCredenciales[i][0], ListaDeCredenciales[i][1], dniAleatorio, balanceInicial);
        }
    }

    public static Usuario ObtenerPorDni(int dni) {
        return Arrays.stream(ListaDeUsuarios)
                .filter(usuario -> usuario.dni == dni)
                .findFirst()
                .orElse(null);
    }

    public static Usuario Autenticar(String nombre, String clave) {
        for (Usuario usuario : ListaDeUsuarios) {
            if (usuario.nombre.equals(nombre) && usuario.clave.equals(clave))
                return usuario;
        }

        return null;
    }

    public static void AgregarUsuario(Usuario usuario) {
        ListaDeUsuarios = Arrays.copyOf(ListaDeUsuarios, ListaDeUsuarios.length + 1);
        ListaDeUsuarios[ListaDeUsuarios.length - 1] = usuario;
    }
}
