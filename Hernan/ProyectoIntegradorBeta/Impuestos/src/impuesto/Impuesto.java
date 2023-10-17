
package impuesto;
import clases. *;

/* En esta clase se encuentra el constructor de los impuestos

*/
public class Impuesto {
    // Atributos
    private double deuda;
    private boolean pagado;
    
    // Constructor vacío
    public Impuesto(){
        
    }
    // Constructor con parámetros
    public Impuesto(double deuda, boolean pagado){ /* Como explique antes, en un
        principio había pensado en un atributo booleano que terminó por ser redundante
        pero no descarto que, en una ampliación, me sea útil, por lo que voy a dejarlo
        */
        this.deuda = deuda;
        this.pagado = pagado;
    }
    // métodos de acceso a los atributos
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


    @Override  // Lo usé en las pruebas. Pero no creo que esté de más
    public String toString() {
        return "Impuestos{" + "deuda=" + deuda + ", pagado=" + pagado + '}';
    }

}
