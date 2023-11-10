
package transferencia;
import servicios.Finanzas;
import servicios.Formulario;
import servicios.Sistema;

import java.util.Scanner;

public class Cbu {
    public Cbu() {
        this.transf();
    }
    public void transf() {
        Formulario formulario = new Formulario();
        int cbu = formulario.PreguntarNumeroEntero("Ingrese el CBU a transferir");
        float dinero = formulario.PreguntarNumero("Ingrese el monto a transferir");
        Finanzas.Transferir(Sistema.getCuenta(), cbu, dinero);
    }
}