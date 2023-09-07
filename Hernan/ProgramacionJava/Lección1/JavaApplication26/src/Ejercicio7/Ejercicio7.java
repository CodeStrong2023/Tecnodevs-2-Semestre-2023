
package javaapplication26;

import java.util.Scanner;


public class Ejercicio7 {

    public static void main(String[] args) {
        final int salario = 1000;
        int comision = 150,venta;
        float salarioM,ventaAuto,porcentajeVenta,totalPrecio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del modelo del auto");
        ventaAuto = Float.parseFloat(entrada.nextLine());
        System.out.println("Ingrese la cantidad de modelos vendidos");
        venta = Integer.parseInt(entrada.nextLine());
        totalPrecio = venta * ventaAuto;
        porcentajeVenta = totalPrecio * 0.05f;
        salarioM = porcentajeVenta + comision + salario;
        System.out.println("El ingreso total del empleado es de $" + salarioM);
        
    }
    
}
