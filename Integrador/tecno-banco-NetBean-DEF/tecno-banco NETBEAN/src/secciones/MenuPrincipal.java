package secciones;

import modelos.Usuario;
import servicios.Menu;

public class MenuPrincipal
{
    Usuario usuario;

    public MenuPrincipal(Usuario usuario) {
        this.usuario = usuario;
    }

    public void Iniciar() {
        System.out.println("¿Que quieres hacer, " + usuario.nombre + "?");
        Menu menu = new Menu(opciones);
        menu.Iniciar();
    }

    public static String[] opciones = new String [] {
            "Transferencia",
            "Realizar una extraccion",
            "Consultar saldo",
            "Pagar impuestos",
            "Administrar tarjeta/s"
    };
}