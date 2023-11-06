import java.util.Scanner;

public class Administrar_Tarjeta_Especifica {//subproceso administrarTarjetaEspecifica(balance, nombreTarjeta, limiteActual)
    public static void main(String[] args) { 
        Scanner administrar = new Scanner(System.in);
        int opcion;
        System.out.println("  Administrar + nombre Tarjeta"); // concatenar con nombreTarjeta
        System.out.println("");
        System.out.println("¿Qué desea hacer?");
        System.out.println(" 1 - Consultar saldo");
        System.out.println(" 2 - Consultar movimientos");
        System.out.println(" 3 - Regresar al menú de administrar tarjeta");
        System.out.println(" 0 - Regresar al menú principal");
        System.out.println("");
        opcion = Integer.parseInt(administrar.nextLine());
        switch(opcion){
            case 0:
                System.out.println("mostrar Menu Principal");// subproceso  mostrarMenuPrincipal(balance, limiteActual);
                break;
            case 1:
                System.out.println("consultar Saldo Tarjeta");// subproceso  consultarSaldoTarjeta(balance, nombreTarjeta, limiteActual);
                break;
            case 2: 
                System.out.println("consultar movimiento tarjeta");// subproceso consultarMovimientosTarjeta(balance, nombreTarjeta, limiteActual);
                break;
            case 3: 
                System.out.println("administrar tarjeta");// subproceso administrarTarjeta(balance, limiteActual);
                break;
            default:
                opcion = -1;
                System.out.println("opción no válida, vuelva a intentarlo");
        }
        if(opcion == -1){
            System.out.println("consultar Saldo Tarjetaaaaa");// subproceso administrarTarjeta(balance, limiteActual);
        }

    }
}
