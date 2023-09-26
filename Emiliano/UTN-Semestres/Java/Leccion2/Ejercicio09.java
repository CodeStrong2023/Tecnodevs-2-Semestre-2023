// Ejercicio 9: Pedir el dia. mes y año de una fecha e indica si la fecha
//              es correcta. Suponiendo que todos los meses son de 30 dias.

import javax.swing.JOptionPane;

public class Ejercicio09 {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Coloque un numero: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Coloque el mes: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Coloque el año: "));
        if((dia != 0) && (dia <= 30)){
            if((mes != 0) && (mes <= 12)){
                if((anio != 0) && (anio <= 2023)){
                    JOptionPane.showMessageDialog(null,"La fecha ingresada es: "+dia+"/"+mes+"/"+anio);
                }
                else{
                    System.out.println("Fecha incorrecta, año incorrecto");
                }

            }
            else{
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, dia incorrecto");
        }
    }
}
