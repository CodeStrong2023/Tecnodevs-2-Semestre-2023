
package transferencia;
import servicios.Finanzas;
import servicios.Formulario;
import servicios.Sistema;

import java.util.Scanner;

public class dni {
    public dni() {
        this.transf();
    }
    public void transf() {
        Formulario formulario = new Formulario();
        int dni = formulario.PreguntarNumeroEntero("Ingrese el DNI a transferir");
        float dinero = formulario.PreguntarNumero("Ingrese el monto a transferir");
        Finanzas.TransferirDNI(Sistema.getCuenta(), dni, dinero);
    }
}