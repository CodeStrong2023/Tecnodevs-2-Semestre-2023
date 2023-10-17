import datos.Usuarios;
import modelos.Usuario;
import secciones.MenuAutenticacion;
import secciones.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
        Usuario usuario;

        Usuarios.Iniciar();
        MenuAutenticacion autenticacion = new MenuAutenticacion();
        usuario = autenticacion.Iniciar();

        MenuPrincipal menuPrincipal = new MenuPrincipal(usuario);
        menuPrincipal.Iniciar();
    }
}