/*
Ejercicio 06: Pedir números hasta que se introduzca un 0.
mostrar la suma de todos los números introducidos
 */
package Ciclos06;

import javax.swing.JOptionPane;

public class Ejercicio06 {
    public static void main(String[] args) {
        int numero, suma = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            suma+= numero;
        }while (numero != 0);
        JOptionPane.showMessageDialog(null, "\n La suma de todos los números ingresados"
                + " es " + suma);
    }
}
