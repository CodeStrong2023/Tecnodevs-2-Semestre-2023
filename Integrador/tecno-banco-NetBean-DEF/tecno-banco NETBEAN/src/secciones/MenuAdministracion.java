package secciones;

import datos.Usuarios;
import modelos.ETarjeta;
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

public class MenuAdministracion {
    public static String[] opcionesPrincipales = new String [] {
            "American Express",
            "VISA",
            "Mastercard",
            "Volver"
    };

    public MenuAdministracion() {
        this.Iniciar();
    }

    public void Iniciar() {
        Menu menu = new Menu(opcionesPrincipales, "Que tarjeta desea administrar?");
        int opcionElegida = menu.Iniciar();

        switch (opcionElegida) {
            case 0:
                new MenuAdministracionEspecifica(ETarjeta.AEXPRESS);
                break;
            case 1:
                new MenuAdministracionEspecifica(ETarjeta.VISA);
                break;
            case 2:
                new MenuAdministracionEspecifica(ETarjeta.MASTERCARD);
                break;
            default:
                break;
        }

        MenuPrincipal.instancia.Iniciar();

    }
}