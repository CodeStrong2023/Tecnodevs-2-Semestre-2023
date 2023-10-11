
package impuesto;
import clases. *;


public class Impuesto {
    // Atributos
    private static double deuda;
    private static boolean pagado;
    
    // Constructor vacío
    public Impuesto(){
        
    }
    // Constructor con parámetros
    public Impuesto(double deuda, boolean pagado){
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
