package datos;

import java.util.Random;

public class Impuestos {
    Random aleatorio = new Random();
    float Impuesto;  // Atributo
    
    public Impuestos() {
        Impuesto = aleatorio.nextFloat() * 999;  // Hago que el atributo sea aleatorio
    }

    public static float TraerDeuda(int opcion) {  // función para ver las deudas
        switch (opcion) {
            case 0:
                return Luz.Impuesto;
            case 1:
                return Gas.Impuesto;
            case 2:
                return Agua.Impuesto;
            case 3:
                return Internet.Impuesto;
            default:
                return 0;
        }
    }

    public static void CancelarDeuda(int opcion) {  // Función para pagar completo. Pasa a 0 el monto
         switch (opcion) {
            case 0:
                Luz.Impuesto = 0;
                break;
            case 1:
                Gas.Impuesto = 0;
                break;
            case 2:
                Agua.Impuesto = 0;
                break;
            case 3:
                Internet.Impuesto = 0;
                break;
            default: break;
        }
    }

    // Creo objetos de cada impuesto
    public static Impuestos Luz = new Impuestos();
    public static Impuestos Gas = new Impuestos();
    public static Impuestos Agua = new Impuestos();
    public static Impuestos Internet = new Impuestos();
    
}
