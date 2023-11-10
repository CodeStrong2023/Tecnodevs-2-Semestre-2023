
package test;
import datos.Usuarios;
import modelos.Usuario;
import secciones.MenuAutenticacion;
import secciones.MenuPrincipal;
import servicios.Sistema;

public class Main {
    public static void main(String[] args) {
        Usuario usuario;

        Usuarios.Iniciar();
        MenuAutenticacion autenticacion = new MenuAutenticacion();
        usuario = autenticacion.Iniciar();

        // lo guardamos para futuro consumo
        Sistema.setUsuario(usuario);

        MenuPrincipal.getInstancia().Iniciar();
    }

    public static void Reiniciar() {
        Sistema.setUsuario(null);
        MenuAutenticacion autenticacion = new MenuAutenticacion();
        Sistema.setUsuario(autenticacion.Iniciar());

        MenuPrincipal.getInstancia().Iniciar();
    }
}
