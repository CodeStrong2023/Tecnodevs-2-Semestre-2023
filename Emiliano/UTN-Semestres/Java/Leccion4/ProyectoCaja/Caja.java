package Java.Leccion4.ProyectoCaja;

public class Caja {
    // Atributos (caracteristicas)
    int ancho;
    int alto;
    int profundo;
    // Metodos y constructores (acciones)
    public Caja(){
        //Constructor1: vacío
    }
    // Contructor con parametros
    public Caja(int ancho, int alto, int profundo){ //Contructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calcularVolumen(){// Metodo para calcular
        return ancho * alto * profundo;
    }
}
