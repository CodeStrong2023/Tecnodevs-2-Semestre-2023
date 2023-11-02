
import javax.swing.JOptionPane;

// Ejercicio 1: Leer un numero y mostrar su cuadrado, repetir el 
//proceso hasta introducir un numero negativo.
 
public class Ejercicio1 {
   
    public static void main(String[] args) {
        
        int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while(numero >= 0){ 
            
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero " + numero +" elevado al cuadrado es " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        System.out.println("El programa ha finalizado por numero negativo");
    }
    }
}
