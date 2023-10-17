
package datos;

import java.util.Random;
import modelos.Impuesto;

public class Impuestos {
    Random aleatorio = new Random();
   
    float Luz = aleatorio.nextFloat()*9999;
    float Agua = aleatorio.nextFloat()*9999;
    float Gas = aleatorio.nextFloat()*9999;
    float Internet = aleatorio.nextFloat()*9999;
    
    public float TraerDeuda(int opcion){
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
}