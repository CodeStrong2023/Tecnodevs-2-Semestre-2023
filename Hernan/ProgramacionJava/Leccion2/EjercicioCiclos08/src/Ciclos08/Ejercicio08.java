/*
 Ejercicio 8: Pedir un número y mostrar todos los números desde 1 hasta
el número N
 */
package Ciclos08;

import javax.swing.JOptionPane;

public class Ejercicio08 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        int i = 1;  
    
        while (i <= numero){
            JOptionPane.showMessageDialog(null, i);
            i ++;
        }
    }
}
