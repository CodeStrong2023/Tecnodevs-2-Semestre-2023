package datos;

import modelos.Usuario;

import java.util.Arrays;
import java.util.Random;

public class Usuarios {
    private final static String[][] ListaDeCredenciales = new String[][] {
            {"Federico", "matear23", "43855842"},
            {"Eugenia", "chamuyo45", "44336433"},
            {"Martin", "asado67", "43822232"},
            {"Tomas", "milonga89", "19832232"},
            {"Clara", "tango01", "41827332"},
            {"Angela", "golazo12", "45664234"},
            {"Lucas", "futbol34", "51233354"}
    };

    public static Usuario[] ListaDeUsuarios;

    public static void Iniciar() {
        ListaDeUsuarios = new Usuario[ListaDeCredenciales.length];
        Random random = new Random();

        for (int i = 0; i < ListaDeCredenciales.length; i++) {
            float balanceInicial = new Random().nextFloat() * 2000;
            int dni = Integer.parseInt(ListaDeCredenciales[i][2]);
            ListaDeUsuarios[i] = new Usuario(ListaDeCredenciales[i][0], ListaDeCredenciales[i][1], dni, balanceInicial);
        }
    }

    public static Usuario ObtenerPorDni(int dni) {
        return Arrays.stream(ListaDeUsuarios)
                .filter(usuario -> usuario.dni == dni)
                .findFirst()
                .orElse(null);
    }

    public static Usuario ObtenerPorNombre(String nombre) {
        return Arrays.stream(ListaDeUsuarios)
                .filter(usuario -> usuario.nombre == nombre)
                .findFirst()
                .orElse(null);
    }

    public static Usuario ObtenerPorAlias(String alias) {
        return Arrays.stream(ListaDeUsuarios)
                .filter(usuario -> usuario.cuenta.alias == alias)
                .findFirst()
                .orElse(null);
    }

    public static Usuario ObtenerPorCbu(int cbu) {
        return Arrays.stream(ListaDeUsuarios)
                .filter(usuario -> usuario.cuenta.cbu == cbu)
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
