
package monto_en_cuenta;
/*
Esta clase es para crear un monto en la cuenta. Debe ser reemplazado por el saldo
que use la aplicación global
*/
public class monto_en_cuenta {
    private static double saldo = 50000;

    public monto_en_cuenta(double saldo){
        
    }

    public static double getSaldo() {
        return saldo;
    }

    public static void setSaldo(double saldo) {
        monto_en_cuenta.saldo = saldo;
    }

    
    

    
    @Override
    public String toString() {
        return "$" + saldo + '}';
    }

    
    
}