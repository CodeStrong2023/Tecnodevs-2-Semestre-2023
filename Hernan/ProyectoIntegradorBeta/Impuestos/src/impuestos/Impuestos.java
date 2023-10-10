
package impuestos;

import java.util.Random;
import test.*;
import java.util.Scanner;


public class Impuestos {
    Scanner entrada = new Scanner(System.in);
    
    // Atributos
    private double deuda;
    private boolean pagado;
    
    public Impuestos(double deuda, boolean pagado){
        this.deuda = deuda;
        this.pagado = pagado;
    }
    

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "Impuestos{" + "deuda=" + deuda + ", pagado=" + pagado + '}';
    }
        

}

