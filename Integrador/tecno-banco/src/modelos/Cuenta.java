package modelos;

public class Cuenta {
    public Usuario usuario;
    public float balance;

    public Cuenta(Usuario usuario, float balance) {
        this.usuario = usuario;
        this.balance = balance;
    }
}
