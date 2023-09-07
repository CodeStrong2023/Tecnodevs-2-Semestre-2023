/*
Leer un número e indicar si es Positivo o Negarivo. El programa finaliza
al digitar el número 0.
 */
package Ciclos02;

import javax.swing.JOptionPane;

public class Ciclos02 {
    public static void main(String[] args) {
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero != 0) {
            if(numero < 0) {
                JOptionPane.showMessageDialog(null, "El número es negativo");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
            }
            else {
                JOptionPane.showMessageDialog(null, "El número es postivo");
                System.out.println("Digite otro número");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
            }
        }
        JOptionPane.showMessageDialog(null, "El número "+numero+" finaliza el programa");
    }
}
