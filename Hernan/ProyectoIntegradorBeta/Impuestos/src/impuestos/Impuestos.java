
package impuestos;

import java.text.DecimalFormat;
import java.util.Random;


public class Impuestos {
    Random aleatorio = new Random();
    DecimalFormat formato = new DecimalFormat("0.00");
    // Atributos
    private double monto_a_pagar = aleatorio.nextDouble()* 9999;
    private boolean pagado;
    private String[] empresa_prestadora;
    
    // Constructor
    public Impuestos(boolean pagado, String[] empresa_prestadora){
        this.empresa_prestadora = empresa_prestadora;
        this.pagado = pagado;
    }
    
    // Métodos
    public double getMonto_a_pagar() {
        return monto_a_pagar;
    }

    public void setMonto_a_pagar(double monto_a_pagar) {
        this.monto_a_pagar = monto_a_pagar;
    }

    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("0.00");
        String montoFormateado = formato.format(monto_a_pagar);
        return "Impuestos{" + "monto_a_pagar=" + montoFormateado + ", pagado=" + pagado + '}';
    }

    public String menu_servicio(String[] opciones){
        return "menu"+opciones;
    }
        
    
    
}

