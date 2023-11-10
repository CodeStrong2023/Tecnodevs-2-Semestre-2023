package modelos;

import datos.Movimientos;

import java.util.*;

public class Tarjeta {
    public ETarjeta tipo;
    public float monto = 0;
    public List<Movimiento> movimientos;

    public Tarjeta(ETarjeta tipo) {
        this.movimientos = Movimientos.GenerarMovimientos();
        for (Movimiento movimiento : movimientos) {
            monto += movimiento.getMonto();
        }
        this.tipo = tipo;
    }

    public Tarjeta() {
        this.tipo = ETarjeta.VISA;
        this.monto = 0;
        this.movimientos = new ArrayList<>();
    }

    public Movimiento sumarMovimiento(String titulo, float monto) {
        Movimiento movimiento = new Movimiento(titulo, monto, new Date()); // new date() = hoy
        movimientos.add(movimiento);
        return movimiento;
    }

    // tuve que usar google para esto porque no sabia como hacerlo :')
    public List<Movimiento> getMovimientos() {
        Collections.sort(movimientos, new Comparator<Movimiento>() {
            @Override
            public int compare(Movimiento m1, Movimiento m2) {
                return m1.getFecha().compareTo(m2.getFecha());
            }
        });
        return movimientos;
    }
}
