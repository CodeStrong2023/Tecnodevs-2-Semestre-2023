package secciones;

import modelos.ETarjeta;
import modelos.Usuario;
import servicios.Finanzas;
import servicios.Menu;
import servicios.Sistema;
import test.Main;
import transferencia.*;

public class MenuPrincipal
{
    public static MenuPrincipal instancia;

    public static MenuPrincipal getInstancia() {
        if (instancia == null)
            instancia = new MenuPrincipal();

        return instancia;
    }

    public MenuPrincipal() {
        if (instancia == null)
            instancia = this;
    }

    public void Iniciar() {
        System.out.println("¿Que quieres hacer, " + Sistema.getUsuario().nombre + "?");
        Menu menu = new Menu(opciones, "Homebanking");
        int opcion = menu.Iniciar();

        switch (opcion){
            case 0:
                new MenuTransferencia();
                break;
            case 1:
                //new MenuExtraccion();
                break;
            case 2:
                Finanzas.MostrarTarjeta(ETarjeta.VISA);
                Sistema.Pausar();
                Finanzas.MostrarTarjeta(ETarjeta.MASTERCARD);
                Sistema.Pausar();
                Finanzas.MostrarTarjeta(ETarjeta.AEXPRESS);
                Sistema.Pausar();
                break;
            case 3:
                new MenuImpuestos();
                break;
            case 4:
                new MenuAdministracion();
            default:
                Main.Reiniciar();
        }

        Iniciar();
    }

    public static String[] opciones = new String [] {
            "Transferencia",
            "Realizar una extraccion",
            "Consultar saldo",
            "Pagar impuestos",
            "Administrar tarjeta/s",
            "Salir"
    };
}