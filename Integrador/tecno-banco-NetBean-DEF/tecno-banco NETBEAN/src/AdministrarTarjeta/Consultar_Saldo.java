import java.util.Scanner;

public class Consultar_Saldo { //SubProceso consultarSaldoTarjeta(balance, nombreTarjeta, limiteActual)
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion, saldoTarjeta;
        saldoTarjeta = (int)(Math.random() * (5001 - 1000)) + 1000; //Numero aleatorio 
        System.out.println("Salgo actual de la tarjeta , nombreTarjeta, :" + saldoTarjeta); //Escribir "Saldo actual de la tarjeta ", nombreTarjeta, ": ", saldoTarjeta;
        System.out.println("");
        System.out.println("¿Qué desea hacer ahora?");
        System.out.println("1 - Consultar los movimientos de la tarjeta");
        System.out.println("2 - Volver al menú de la tarjeta ,nombreTarjeta");// concatenar con nombreTarjeta
        System.out.println("0 - Volver al menú principal");
        System.out.println("");
        System.out.println("Digite la opción: ");
        opcion = Integer.parseInt(entrada.nextLine());
        switch(opcion){
            case 0:
                System.out.println("mostrar Menu Principal");//subproceso mostrarMenuPrincipal(balance, limiteActual);
                break;
            case 1:
                System.out.println("consultar Movimientos Tarjeta");//subproceso consultarMovimientosTarjeta(balance, nombreTarjeta, limiteActual);
                break;
            case 2: 
                System.out.println("administrar Tarjeta Especifica");//subproceso  administrarTarjetaEspecifica(balance, nombreTarjeta, limiteActual);
                break;
            default:
                opcion = -1;
                System.out.println("opción no válida, vuelva a intentarlo");
        }
        
        if(opcion == -1){
            System.out.println("consultar Saldo Tarjetaaaaa");//subproceso consultarSaldoTarjeta(balance, nombreTarjeta, limiteActual);
        }
     }
        
}
 
