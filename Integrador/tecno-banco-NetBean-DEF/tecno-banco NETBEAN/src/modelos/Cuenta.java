package modelos;

import servicios.Finanzas;

import java.util.Arrays;
import java.util.List;

public class Cuenta {
    public Usuario usuario;
    public Tarjeta[] tarjetas; // la primer tarjeta va a ser la principal (por defecto)
    public String alias;
    public int cbu;

    public Cuenta(Usuario usuario) {
        this.tarjetas = new Tarjeta[] {
                new Tarjeta(ETarjeta.VISA),
                new Tarjeta(ETarjeta.AEXPRESS),
                new Tarjeta(ETarjeta.MASTERCARD)
        };
        this.usuario = usuario;
        this.alias = Finanzas.GenerarAlias();
        this.cbu = Finanzas.GenerarCBU();
    }

    public Cuenta(Usuario usuario, Tarjeta tarjeta, String alias, int cbu) {
        this.tarjetas = new Tarjeta[] {
                tarjeta
        };

        this.usuario = usuario;
        this.alias = alias;
        this.cbu = cbu;
    }

    public float getBalance() {
        return this.tarjetas[0].monto;
    }

    public float getBalance(ETarjeta tipo) {
        return obtenerTarjeta(tipo).monto;
    }

    public Tarjeta obtenerTarjeta(ETarjeta tipo) {
        Tarjeta tarjeta = Arrays.stream(tarjetas)
                .filter(t -> t.tipo == tipo)
                .findFirst()
                .orElse(null);
        return tarjeta;
    }

    public void setBalance(float balance) {
        this.tarjetas[0].monto = balance;
    }
}
