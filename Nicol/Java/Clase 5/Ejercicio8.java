// Ejercicio 8: Pedir un numero N, y mostrar todos los numeros del 1 al N.

import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {
      
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque un numero: "));
        int i = 1;
        while(i <= numero){
            JOptionPane.showMessageDialog(null, (i));
            i++;
        }
    }
}
