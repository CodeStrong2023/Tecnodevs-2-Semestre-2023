package modelos;

import servicios.Finanzas;

public class Cuenta {
    public Usuario usuario;
    public float balance;
    public String alias;
    public int cbu;

    public Cuenta(Usuario usuario, float balance) {
        this.usuario = usuario;
        this.balance = balance;
        this.alias = Finanzas.GenerarAlias();
        this.cbu = Finanzas.GenerarCBU();
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
