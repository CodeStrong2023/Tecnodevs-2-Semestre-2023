package transferencia;

import servicios.Finanzas;
import servicios.Formulario;
import servicios.Sistema;

import java.util.Scanner;


public class alias {
    public alias() {
        this.transf();
    }

    public void transf() {
        Formulario formulario = new Formulario();
        String alias = formulario.PreguntarPalabra("Ingrese el alias a transferir");
        float dinero = formulario.PreguntarNumero("Ingrese el monto a transferir");
        Finanzas.Transferir(Sistema.getCuenta(), alias, dinero);
    }
}