/*
Proyecto Caja:
Ejercicio 1: Crear un poyecto según las especificaciones
mostradas a continuación.
La fórmula es: volumen = ancho * alto * profundidad
Mostrado con dos tipos de constructores
- uno vacío
- otro que reciba argumentos como parámetros
 */
package caja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaCaja {
    //Empezamos ingresando el main
    public static void main(String[] args) {
        //Importamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        //Creamos variables locales
        System.out.println("Ingrese la altura: ");
        float alt = Float.parseFloat(entrada.nextLine());
        System.out.println("Ingrese ancho: ");
        float anch = Float.parseFloat(entrada.nextLine());
        System.out.println("Ingrese profundidad: ");
        float prof = Float.parseFloat(entrada.nextLine());
        
        Caja caja1 = new Caja(); //Hacemos uso del constructor vacío
        //Le damos el valor de las variables locales a
        //los atributos
        caja1.alto = alt; 
        caja1.ancho = anch;
        caja1.profundo = prof;
        System.out.println("El volumen de la caja n°1 es: " + caja1.volumenCaja());
        
        //Cambiamos los valores de la segunda caja y aprovechamos a añadir
        //el JOptionPane aprovechando la dinámica de las variables
        alt = Float.parseFloat(JOptionPane.showInputDialog("Ingrese altura de la 2° Caja: "));
        anch = Float.parseFloat(JOptionPane.showInputDialog("Ingrese anchura de la 2° Caja: "));
        prof = Float.parseFloat(JOptionPane.showInputDialog("Ingrese profundidad de la 2° Caja: "));
      
        //Hice el ingreso de valores del JOptionPane en segundo lugar, lo que hace
        //que quede oculta detrás de la aplicación, haciendo que deba minimizarse
        //para completar el programa. Sin embargo, funciona correctamente
        
        
        Caja caja2 = new Caja(alt,anch,prof); //Hacemos uso del segundo constructor
        //Como ya le pasamos los valores solamente imprimimos el resultado
        JOptionPane.showMessageDialog(null, "El volumen de caja n°2 es: " + caja2.volumenCaja());
    }
}
