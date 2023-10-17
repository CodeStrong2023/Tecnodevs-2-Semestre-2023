package modelos;

public class Usuario {
    public String nombre;
    public String clave;
    public int dni;
    public final Cuenta cuenta;

    public Usuario(String nombre, String clave, int dni, float balance) {
        this.nombre = nombre;
        this.clave = clave;
        this.dni = dni;
        cuenta = new Cuenta(this, balance);
    }
}
