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
        int opcion = menu.Iniciar();  //añado int opcion en esta sección para usarlo como switch
        switch (opcion){
            case 3: {  // Solamente puse la opción 3 para derivar desde acá. Impuestos correspondería al 3.
                MenuImpuestos menuImpuestos = new MenuImpuestos();
                menuImpuestos.MenuImpuestos__Inicial(usuario.cuenta.balance);
            }
        }
    }

    public static String[] opciones = new String [] {
            "Transferencia",
            "Realizar una extraccion",
            "Consultar saldo",
            "Pagar impuestos",
            "Administrar tarjeta/s"
    };
}