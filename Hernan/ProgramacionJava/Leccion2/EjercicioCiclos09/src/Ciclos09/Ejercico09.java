/*
Ejercicio 9: Pedir el día, mes y años de una fecha e
indicar si la fecha es correcta. Suponientdo que
todos los meses son de 30 días
 */
package Ciclos09;

import javax.swing.JOptionPane;

public class Ejercico09 {
    public static void main(String[] args) {

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));
        
        if ((dia != 0)&&(dia <= 30)){
            if ((mes != 0)&&(mes <=12)){
                if ((anio != 0)&&(anio <= 2023)){
                    JOptionPane.showMessageDialog(null, "La fecha es correcta");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, error en el año");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, error en el mes");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, error en el día");
        }
    }
}
