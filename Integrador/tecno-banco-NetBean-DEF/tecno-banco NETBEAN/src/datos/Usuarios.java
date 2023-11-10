package datos;

import modelos.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Usuarios {
    private static String[][] ListaDeCredenciales = new String[][] {
            {"Federico", "matear23", "43855842"},
            {"Eugenia", "chamuyo45", "44336433"},
            {"Martin", "asado67", "43822232"},
            {"Tomas", "milonga89", "19832232"},
            {"Clara", "tango01", "41827332"},
            {"Angela", "golazo12", "45664234"},
            {"Lucas", "futbol34", "51233354"}
    };

    public static List<Usuario> ListaDeUsuarios = new ArrayList<>();

    public static void Iniciar() {
        for (String[] credencial : ListaDeCredenciales) {
            int dni = Integer.parseInt(credencial[2]);
            Usuario usuario = new Usuario(credencial[0], credencial[1], dni);
            ListaDeUsuarios.add(usuario);
        }
    }

    public static void AgregarUsuario(String nombre, String clave, int dni) {
        Usuario nuevoUsuario = new Usuario(nombre, clave, dni);
        ListaDeUsuarios.add(nuevoUsuario);
    }

    public static void AgregarUsuario(Usuario usuario) {
        ListaDeUsuarios.add(usuario);
    }

    public static Usuario ObtenerPorDni(int dni) {
        return ListaDeUsuarios.stream()
                .filter(usuario -> usuario.getDni() == dni) // assuming getDni() is the getter for DNI
                .findFirst()
                .orElse(null);
    }

    public static Usuario ObtenerPorNombre(String nombre) {
        return ListaDeUsuarios.stream()
                .filter(usuario -> usuario.getNombre().equals(nombre)) // assuming getNombre() is the getter for name
                .findFirst()
                .orElse(null);
    }

    public static Usuario ObtenerPorAlias(String alias) {
        return ListaDeUsuarios.stream()
                .filter(usuario -> usuario.getCuenta().getAlias().equals(alias)) // assuming getAlias() is the getter for alias
                .findFirst()
                .orElse(null);
    }

    public static Usuario ObtenerPorCbu(int cbu) {
        return ListaDeUsuarios.stream()
                .filter(usuario -> usuario.getCuenta().getCbu() == cbu) // assuming getCbu() is the getter for CBU
                .findFirst()
                .orElse(null);
    }

    public static Usuario Autenticar(String nombre, String clave) {
        return ListaDeUsuarios.stream()
                .filter(usuario -> usuario.getNombre().equals(nombre) && usuario.getClave().equals(clave))
                .findFirst()
                .orElse(null);
    }
}
