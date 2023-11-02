// Ejercicio 3: Leer numero hasta que se coloque cero.
//Para cada uno indicar si es par o impar.

import javax.swing.JOptionPane;

public class Ejercicio03 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while(numero != 0){
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es PAR");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es IMPAR");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "El numero "+numero+" finaliza el programa");
    }
}
