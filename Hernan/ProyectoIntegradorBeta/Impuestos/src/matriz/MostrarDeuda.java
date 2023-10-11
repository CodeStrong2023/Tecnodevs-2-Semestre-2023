
package matriz;
import Clases.*;
import clases.Clases;
import java.text.DecimalFormat;
/*
Esta clase muestra las deudas que se tienen en los servicios en forma de matriz
*/

public class MostrarDeuda {
    

    public static void mostrar_deuda() {
        System.out.println("\n---------------------------------------------------------------\n");
        int filas = 2;  
        int columnas = 4;
        /* Para no complicarme, pongo el número de filas y columnas
        en variables. de esta forma sé en todo momento si estoy trabajando con filas
        o columnas
        */
        Object[][] estado_servicios = new Object[filas][columnas];  /* Creo el objeto matriz. Sobretodo
        porque la primera fila será String mientras que el resto serán double. Así me resultó más
        simple manejar los valores
        */
        DecimalFormat decimalFormat = new DecimalFormat("0.00");  /* Creo el objeto decimalFormat para 
        convertir las deudas en String con sólo dos decimales
        */
        
        estado_servicios[0][0] = "Luz  ";  // Lleno los valores de la matriz de forma manual
        estado_servicios[0][1] = "Agua ";
        estado_servicios[0][2] = "Gas  ";
        estado_servicios[0][3] = "Internet";

        estado_servicios[1][0] = decimalFormat.format(Clases.Luz.getDeuda());
        estado_servicios[1][1] = decimalFormat.format(Clases.Agua.getDeuda());
        estado_servicios[1][2] = decimalFormat.format(Clases.Gas.getDeuda());
        estado_servicios[1][3] = decimalFormat.format(Clases.Internet.getDeuda());

        

        for (int i = 0; i < filas; i++) {  // Imprimo la matriz creada con 2 ciclos for anidados
            for (int j = 0; j < columnas; j++) {
                System.out.print(estado_servicios[i][j] + "\t \t");  // Agrego tabulación con \t para el orden
            }
            System.out.println();  // Doy forma de matriz
        }
        System.out.println("\n---------------------------------------------------------------\n");
    }
}
