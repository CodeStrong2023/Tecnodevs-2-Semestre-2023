
package secciones;
import datos.Usuarios;
import java.text.DecimalFormat;
import java.util.Random;
import modelos.*;
import servicios.*;
import datos.Impuestos;

public class MenuImpuestos {
    public MenuImpuestos(){
        
    }
    public void MenuImpuestos__Inicial(){
        String[] seleccion = new String[]{
            "Ver estado de deuda",
            "Pagar un servicio/impuesto",
            "Volver"
        };
        Menu menu = new Menu(seleccion);
        int opcion = menu.Iniciar();
        
        switch(opcion){
            case 0: System.out.println("Su estado de cuenta es:"); break;
            case 1: System.out.println("Ha elegido pagar un impuesto/servicio");
            MenuImpuestos__Impuestos(); break;
            case 2: ; break;
            default: System.out.println("No ha elegido una opción válida"); break;
        }
    }
    public void MenuImpuestos__Impuestos(){
        String[] impuestos = new String[]{
            "Luz",
            "Gas",
            "Agua",
            "Internet"
        };
        Menu menu = new Menu(impuestos);
        int opcion = menu.Iniciar();
        Random aleatorio = new Random();
        DecimalFormat dosDecimales = new DecimalFormat("0.00");
        
    ConfirmarPagoImpuesto confirmar = new ConfirmarPagoImpuesto();
    Impuestos pagar = new Impuestos();
        switch(opcion){
            case 0: 
                System.out.println("Su empresa prestadora de luz es EDEMSA: ");
                System.out.println("Usted tiene deuda de $"+dosDecimales.format(pagar.TraerDeuda(opcion)));
                confirmar.Confirma__Pago();
                break;
            case 1: 
                System.out.println("Su empresa prestadora de gas es ECOGAS CUYANA");
                System.out.println("Usted tiene deuda de $"+dosDecimales.format(pagar.TraerDeuda(opcion)));
                confirmar.Confirma__Pago();
                break;
            case 2: 
                System.out.println("Su empresa prestadora de agua es AySAM"); 
                System.out.println("Usted tiene deuda de $"+dosDecimales.format(pagar.TraerDeuda(opcion)));
                confirmar.Confirma__Pago();
                break;
            case 3: 
                System.out.println("Su empresa prestadora de internet es CLARO");
                System.out.println("Usted tiene deuda de $"+dosDecimales.format(pagar.TraerDeuda(opcion)));
                confirmar.Confirma__Pago();
                break;
            default: break;
        }
    }
}
