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

public class MenuAdministracionEspecifica {
    public ETarjeta tipo;
    public static String[] opcionesPrincipales = new String [] {
            "Consultar saldo",
            "Consultar movimientos",
            "Volver"
    };

    public MenuAdministracionEspecifica(ETarjeta tipo) {
        this.tipo = tipo;
        this.Iniciar();
    }

    public void Iniciar() {
        Menu menu = new Menu(opcionesPrincipales, "Que tarjeta desea administrar?");
        int opcionElegida = menu.Iniciar();

        switch (opcionElegida) {
            case 0:
                Finanzas.MostrarTarjeta(tipo, false);
                break;
            case 1:
                Finanzas.MostrarTarjeta(tipo, true);
                break;
        }
    }
}