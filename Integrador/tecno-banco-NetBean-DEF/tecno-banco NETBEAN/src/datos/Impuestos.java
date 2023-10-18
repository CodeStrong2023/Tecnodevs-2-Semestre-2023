
package datos;

import java.util.Random;

// Realizo la creación de los impuestos y les asigno montos aleatorios
public class Impuestos {
    Random aleatorio = new Random();
   
    float Luz = aleatorio.nextFloat()*9999;  // Asigno valores aleatorios a los servicios
    float Agua = aleatorio.nextFloat()*9999;
    float Gas = aleatorio.nextFloat()*9999;
    float Internet = aleatorio.nextFloat()*9999;
    
    public float TraerDeuda(int opcion){  // Función que muestra las deudas creadas
        switch (opcion){
            case 0:{
                return Luz;
            }
            case 1:{
                return Gas;
            }
            case 2:{
                return Agua;
            }
            case 3:{
                return Internet;
            }
            default: return 0;
        }
    } 
    public void CancelarDeuda(int opcion){  // Función que cancela las deudas dándole valor de 0
        switch (opcion){
            case 0:{
                Luz = 0;
                break;
            }
            case 1:{
                Gas = 0;
                break;
            }
            case 2:{
                Agua = 0;
                break;
            }
            case 3:{
                Internet = 0;
                break;
            }
        }
    }
}