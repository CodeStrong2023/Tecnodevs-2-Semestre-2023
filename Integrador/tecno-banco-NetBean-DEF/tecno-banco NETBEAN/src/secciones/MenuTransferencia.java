package secciones;

import datos.Usuarios;
import modelos.Usuario;
import servicios.Finanzas;
import servicios.Formulario;
import servicios.Menu;
import servicios.Sistema;
import transferencia.Cbu;
import transferencia.alias;
import transferencia.dni;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MenuTransferencia {
    public static String[] opcionesPrincipales = new String [] {
            "Nueva transferencia",
            "Contacto agendados",
            "Volver"
    };

    public static String[] opcionesNuevaTransferencia = new String[] {
            "CBU",
            "Alias",
            "DNI",
            "Volver"
    };

    public MenuTransferencia() {
        this.Iniciar();
    }

    public void Iniciar() {
        Menu menu = new Menu(opcionesPrincipales, "Opciones de transferencia");
        int opcionElegida = menu.Iniciar();

        switch (opcionElegida) {
            case 0:
                this.IniciarNuevaTransferencia();
                break;
            case 1:
                this.IniciarCuentaAgendada();
                break;
            case 2:
                MenuPrincipal.instancia.Iniciar();
        }
    }

    public void IniciarNuevaTransferencia() {
        Menu menu = new Menu(opcionesNuevaTransferencia, "Opciones de transferencia");
        int opcionElegida = menu.Iniciar();

        switch (opcionElegida) {
            case 0:
                new Cbu();
                break;
            case 1:
                new alias();
                break;
            case 2:
                new dni();
            case 3:
                Iniciar();
                break;
        }
    }

    public void IniciarCuentaAgendada() {
        List<String> listaNombres = new ArrayList<>();
        Formulario formulario = new Formulario();


        for (Usuario usuario : Usuarios.ListaDeUsuarios) {
            if (!Objects.equals(usuario.nombre, Sistema.getUsuario().nombre))
                listaNombres.add(usuario.nombre);
        }

        String[] nombres = listaNombres.toArray(new String[0]);
        Menu menu = new Menu(nombres, "Contactos");
        int opcionElegida = menu.Iniciar();

        Usuario objetivo = Usuarios.ObtenerPorNombre(nombres[opcionElegida]);
        float dinero = formulario.PreguntarNumero("Ingrese el monto a transferir");
        Finanzas.Transferir(Sistema.getCuenta(), objetivo.cuenta, dinero);
    }
}