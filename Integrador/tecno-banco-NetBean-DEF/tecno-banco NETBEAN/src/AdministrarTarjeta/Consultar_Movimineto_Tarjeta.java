import java.util.Scanner;

public class Consultar_Movimineto_Tarjeta { // SubProceso consultarMovimientosTarjeta(balance, nombreTarjeta, limiteActual)
    public static void main(String[] args) {
        Scanner consultar = new Scanner(System.in);
        int opcion;
        System.out.println(" Últimos movimientos de la tarjeta + nombreTarjeta + :");//concatenamos con nombreTarjeta
        System.out.println("");
        System.out.println("Fecha Transacción - Código - Detalle - Monto");
        System.out.println("----------------------------------------------------");
        System.out.println("01/06/2023 - 1234 - Compra en Amazon - -2000");
        System.out.println("03/06/2023 - 2345 - Pago de cable - -5000");
        System.out.println("07/06/2023 - 3456 - Devolución - +500");
        System.out.println("12/06/2023 - 4567 - Compra en Ebay - -4000");
        System.out.println("20/06/2023 - 5678 - Pago de celular - -1000");
        System.out.println("23/06/2023 - 6789 - Compra en MercadoLibre - -1500");
        System.out.println("25/06/2023 - 7890 - Pago de internet - -1200");
        System.out.println("28/06/2023 - 8901 - Compra en Rappi - -700");
        System.out.println("30/06/2023 - 9012 - Pago de Netflix - -500");
        System.out.println("02/07/2023 - 0123 - Compra en Uber Eats - -800");
        System.out.println("04/07/2023 - 1234 - Pago de Spotify - -300");
        System.out.println("08/07/2023 - 2345 - Compra en Apple Store - -2500");
        System.out.println("12/07/2023 - 3456 - Pago de gas - -800");
        System.out.println("15/07/2023 - 4567 - Compra en Google Play - -400");
        System.out.println("");
        System.out.println("¿Qué desea hacer ahora");
        System.out.println("1 - Consultar el saldo de la tarjeta");
        System.out.println("2 - Volver al menú de la + nombreTarjeta");//concatenamos con nombreTarjeta
        System.out.println("0 - Volver al menú principal");
        System.out.println("");
        opcion = Integer.parseInt(consultar.nextLine());
        switch(opcion){
            case 0:
                System.out.println("mostrar Menu Principal");//subproceso mostrarMenuPrincipal(balance, limiteActual);
                break;
            case 1:
                System.out.println("consultar saldo Tarjeta");//subproceso consultarSaldoTarjeta(balance, nombreTarjeta, limiteActual);
                break;
            case 2: 
                System.out.println("administrar Tarjeta Especifica");//subproceso  administrarTarjetaEspecifica(balance, nombreTarjeta, limiteActual);
                break;
            default:
                opcion = -1;
                System.out.println("opción no válida, vuelva a intentarlo");
        }

        if(opcion == -1){
            System.out.println("consultar Movimiento Tarjeta");//subproceso consultarMovimientosTarjeta(balance, nombreTarjeta, limiteActual);
        }
        
    }
}
