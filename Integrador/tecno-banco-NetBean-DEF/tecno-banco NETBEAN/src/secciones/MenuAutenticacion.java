package secciones;

import datos.Usuarios;
import modelos.ETarjeta;
import modelos.Tarjeta;
import modelos.Usuario;
import servicios.Finanzas;
import servicios.Formulario;
import servicios.Menu;
import servicios.Sistema;

public class MenuAutenticacion {
    public static String[] opcionesPrincipales = new String [] {
            "Iniciar sesion",
            "Registrarse"
    };

    public Usuario Iniciar() {
        Menu menu = new Menu(opcionesPrincipales);

        Usuario usuario = null;
        boolean iniciado;

        do {
            int opcionElegida = menu.Iniciar();
            switch (opcionElegida) {
                case 0:
                    usuario = IniciarIngreso();
                    break;
                case 1:
                    IniciarRegistro();
                    break;
            }
            iniciado = usuario != null;
        } while (!iniciado);

        System.out.println("Has iniciado sesion como " + usuario.nombre);
        return usuario;
    }

    private Usuario IniciarIngreso() {
        Formulario formulario = new Formulario();

        String nombre = "";
        String clave;
        Usuario usuario;

        do {
            if (!nombre.isEmpty())
                System.out.println("Nombre o clave incorrecta");

            nombre = formulario.PreguntarPalabra("Ingrese su nombre");
            clave = formulario.PreguntarPalabra("Ingrese su clave");

            usuario = Usuarios.Autenticar(nombre, clave);
        } while (usuario == null);

        return usuario;
    }

    private void IniciarRegistro() {
        Formulario formulario = new Formulario();
        // NOMBRE ------------------------------------
        Sistema.Separar();
        String nombre = formulario.PreguntarPalabra("Ingrese su nombre");

        // CLAVE ---------------------------------------
        String clave;
        String confirmacion;
        boolean primeraVezIntentando = true;

        do {
            Sistema.Separar();
            if (!primeraVezIntentando)
                System.out.println("Haz fallado la confirmacion de clave");

            clave = formulario.PreguntarPalabra("Ingrese una clave");
            confirmacion = formulario.PreguntarPalabra("Ingrese la clave nuevamente");

            primeraVezIntentando = false;
        } while (!clave.equals(confirmacion));

        // DNI ------------------------------------
        int dni;
        boolean repetido;
        boolean formatoIncorrecto;
        do {
            Sistema.Separar();
            dni = formulario.PreguntarNumeroEntero("Ingrese su numero de documento (sin puntos)");

            formatoIncorrecto = (dni < 10000000 || dni > 99999999);
            if (formatoIncorrecto)
                System.out.println("El DNI debe tener exactamente 8 dígitos. Intente nuevamente");

            repetido = Usuarios.ObtenerPorDni(dni) != null;
            if (repetido)
                System.out.println("Ya existe un usuario con ese DNI");
        } while (formatoIncorrecto || repetido);

        // ALIAS Y CBU ------------------------------
        String alias = Finanzas.GenerarAlias();
        int cbu = Finanzas.GenerarCBU();
        System.out.println("Se ha generado un usuario.");
        System.out.println("Se te ha creado una cuenta de ahorro " + ETarjeta.VISA + " con las siguientes propiedades:");
        System.out.println("ALIAS: " + alias);
        System.out.println("CBU: " + cbu);
        Sistema.Pausar();

        Usuario usuario = new Usuario(nombre, clave, dni, new Tarjeta(), alias, cbu);
        System.out.println("Bienvenido " + nombre + " a TecnoBanco! Ahora puedes iniciar sesion");

        Usuarios.AgregarUsuario(usuario);
    }
}