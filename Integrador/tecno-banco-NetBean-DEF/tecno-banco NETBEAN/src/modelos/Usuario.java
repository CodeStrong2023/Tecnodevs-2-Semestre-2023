package modelos;

public class Usuario {
    public String nombre;
    public String clave;
    public int dni;
    public final Cuenta cuenta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public Usuario(String nombre, String clave, int dni) {
        this.nombre = nombre;
        this.clave = clave;
        this.dni = dni;
        cuenta = new Cuenta(this);
    }

    public Usuario(String nombre, String clave, int dni, Tarjeta tarjeta, String alias, int cbu) {
        this.nombre = nombre;
        this.clave = clave;
        this.dni = dni;
        cuenta = new Cuenta(this, tarjeta, alias, cbu);
    }
}
