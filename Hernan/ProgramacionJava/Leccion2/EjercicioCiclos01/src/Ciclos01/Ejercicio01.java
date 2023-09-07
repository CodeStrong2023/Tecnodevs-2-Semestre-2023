
package Ciclos01;

import javax.swing.JOptionPane;

public class Ejercicio01 {
    public static void main(String[] args) {
        int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        while(numero >= 0) {
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El número "+numero+" elevado al cuadrado es: "+cuadrado);
            System.out.println("Ingrese otro número");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número"));
        }
        System.out.println("El número "+numero+" finaliza el programa");
    }
}
