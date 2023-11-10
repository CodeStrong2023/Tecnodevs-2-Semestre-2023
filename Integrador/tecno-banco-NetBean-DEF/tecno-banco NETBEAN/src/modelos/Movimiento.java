package modelos;

import java.util.Date;

public class Movimiento {
    public String nombre;
    public float monto;

    public String getNombre() {
        return nombre;
    }

    public Movimiento(String nombre, float monto, Date fecha) {
        this.nombre = nombre;
        this.monto = monto;
        this.fecha = fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date fecha;
}
