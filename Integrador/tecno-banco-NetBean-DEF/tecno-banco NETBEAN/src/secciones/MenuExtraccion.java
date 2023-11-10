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

public class MenuExtraccion {
    public static String[] opcionesPrincipales = new String [] {
            "Extraer con codigo",
            "Volver"
    };

    public MenuExtraccion() {
        this.Iniciar();
    }

    public void Iniciar() {
        Menu menu = new Menu(opcionesPrincipales, "Que tarjeta desea administrar?");
        int opcionElegida = menu.Iniciar();

        switch (opcionElegida) {
            case 0:
                ComenzarExtraccion();
            default:
                break;
        }

        MenuPrincipal.instancia.Iniciar();
    }

    public void ComenzarExtraccion() {
        Formulario formulario = new Formulario();

        float cantidad = formulario.PreguntarNumero("Ingrese el monto a retirar");
        System.out.println("Se ha generado una clave para realizar una extraccion.");
        int clave = Sistema.GenerarNumeroEntero(4);
        System.out.println("Por favor ingrese esta clave en su cajero mas cercano: " + clave);

        Finanzas.Extraer(cantidad);
        Sistema.Pausar();
    }
}