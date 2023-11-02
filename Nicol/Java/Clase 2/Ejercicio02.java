// Ejercicio 2: Leer un numero e indicar si es positivo o negativo,
//repetir el proceso hasta introducir el numero cero.

import javax.swing.JOptionPane;

public class Ejercicio02 {
    
    public static void main(String[] args) {
        
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while(numero != 0){
            if(numero > 0){
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es POSITIVO");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es NEGATIVO");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));  
        }
        JOptionPane.showMessageDialog(null,"El numero "+numero+" finaliza el programa");
    }
}
