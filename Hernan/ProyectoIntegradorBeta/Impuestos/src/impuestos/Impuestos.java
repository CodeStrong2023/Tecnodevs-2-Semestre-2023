
package impuestos;
import test.*;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;


public class Impuestos {
    Scanner entrada = new Scanner(System.in);
    Random aleatorio = new Random();
    DecimalFormat formato = new DecimalFormat("0.00");
    // Atributos
    
    private static double monto_a_pagar;
    // private static double monto_a_pagar = monto_a_pagar0;
    private static boolean pagado;
    private static String[] empresa_prestadora;
    private static double saldo_en_cuenta = 10000;
    
    // Constructor
    public Impuestos(){
        
    }
    public Impuestos(boolean pagado, String[] empresa_prestadora){
        this.empresa_prestadora = empresa_prestadora;
        this.pagado = pagado;
        this.monto_a_pagar = aleatorio.nextDouble()* 9999;
        this.monto_a_pagar = monto_a_pagar;
        
    }
    // Métodos
    public double getMonto_a_pagar() {
        return monto_a_pagar;
    }

    public void setMonto_a_pagar(double monto_a_pagar) {
        this.monto_a_pagar = monto_a_pagar;
    }

    public static double getSaldo_en_cuenta() {
        return saldo_en_cuenta;
    }

    public static void setSaldo_en_cuenta(double saldo_en_cuenta) {
        Impuestos.saldo_en_cuenta = saldo_en_cuenta;
    }

    public static boolean isPagado() {
        return pagado;
    }

    public static void setPagado(boolean pagado) {
        Impuestos.pagado = pagado;
    }
    
    
    public boolean volver_a_entrar (boolean pagado){
        pagado = true;
        return pagado;
    }
    public double Saldo (double deuda,double saldo_en_cuenta){
        deuda = 0;
        saldo_en_cuenta -= deuda;
        return saldo_en_cuenta;
        
    }
    public double deuda_pagada(double deuda){
        deuda = 0;
        return deuda;
    }
    
    public String menu_servicio(String[] opciones, double deuda_servicio){
        
        System.out.println("\nSelecciones su empresa prestadora de servicio: ");
        for (int i = 0; i <= opciones.length -1; i++){
            System.out.println(opciones[i]);
        }
        System.out.println("\nO presione \"0\" para volver al menú anterior\n");
        int opcion_servicio = Integer.parseInt(entrada.nextLine());
        if ((opcion_servicio != 0)&&(opcion_servicio <= opciones.length)){
            
            pagar_impuestos(deuda_servicio,saldo_en_cuenta,pagado);
        } else if (opcion_servicio == 0){
            
        } else {
            System.out.println("\nLa opción ingresada no es válida\n");
            menu_servicio(opciones,deuda_servicio);
        }
        return "";
    }
        public String pagar_impuestos(double deuda, double saldo_en_cuenta, boolean pagado){
        Scanner entrada = new Scanner(System.in);
        if (deuda > saldo_en_cuenta){
            System.out.println("Ha excedido su monto en cuenta");
        } else if (deuda <= saldo_en_cuenta){
            System.out.println("Su deuda es de: $"+deuda);
            System.out.println("El saldo en su cuenta es de "+saldo_en_cuenta);
            System.out.println("Marque 1 si desea pagar este servicio");
            int opcion = Integer.parseInt(entrada.nextLine());
                    Impuestos.saldo_en_cuenta -= deuda;
                    Impuestos.pagado = true;
            if (opcion == 1){
                System.out.println("Ha pagado el servicio");

        } else {
            System.out.println("El ingreso no es válido");
        }
        System.out.println("Para volver al menú presione \"0\"");
        
        }
        return "";
    }
}

