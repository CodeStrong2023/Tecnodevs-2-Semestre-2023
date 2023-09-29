// Ejercicio 2: Leer un número e indicar si es positivo o negativo,
//              repetir el proceso hasta introducir el número cero.

import javax.swing.JOptionPane;

public class Ejercicio02 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque un número: "));
        while(numero != 0){
            if(numero > 0){
                JOptionPane.showMessageDialog(null, "El número "+numero+" es POSITIVO");
            }
            else{
                JOptionPane.showMessageDialog(null, "El número "+numero+" es NEGATIVO");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque un número: "));  
        }
        JOptionPane.showMessageDialog(null,"El número "+numero+" finaliza el programa");
    }
}
