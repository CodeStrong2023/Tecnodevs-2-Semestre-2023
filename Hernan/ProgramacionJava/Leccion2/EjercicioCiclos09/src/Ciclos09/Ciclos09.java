/*
Ejercicio 9: Pedir el día, mes y años de una fecha e
indicar si la fecha es correcta. Suponientdo que
todos los meses son de 30 días
 */
package Ciclos09;

import java.util.Scanner;

public class Ciclos09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, anio;
        
        System.out.println("Ingrese el día: ");
        dia = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el mes: ");
        mes = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el año");
        anio = Integer.parseInt(entrada.nextLine());
        
        if ((dia != 0) && (dia <= 30)){
            if ((mes != 0)&& (mes <= 12)){
                if ((anio != 0)&&(anio <= 2023)){
                    System.out.println("La fecha "+dia+"/"+mes+"/"+anio+" es correcta");
                }
                else {
                    System.out.println("Fecha incorrecta, año incorrecto");
                }
            }
            else {
                System.out.println("Fecha incorrecta, mes incorrecto");
            }
        }
        else {
            System.out.println("Fecha incorrecta, día incorrecto");
        }
    }
}
