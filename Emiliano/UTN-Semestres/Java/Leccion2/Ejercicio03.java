// Ejercicio 3: Leer números hasta que se coloque cero.
//              Para cada uno indicar si es par o impar.

import javax.swing.JOptionPane;

public class Ejercicio03 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque un número: "));
        while(numero != 0){
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es PAR");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es IMPAR");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque otro número: "));
        }
        JOptionPane.showMessageDialog(null, "El número "+numero+" finaliza el programa");
    }
}
