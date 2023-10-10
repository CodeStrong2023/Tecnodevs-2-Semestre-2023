
package monto_en_cuenta;

public class monto_en_cuenta {
    double saldo = 50000;
    public monto_en_cuenta(double saldo) {
        this.saldo = saldo;
    }
    
    public static monto_en_cuenta saldo_cuenta = new monto_en_cuenta(50000);
}