
package domain;

public class Persona {
    // Atributos
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    
    /*
    Constructor Vacío: se usa para poder crear objetos sin necesidad de inicializar
    los atributos
    */
    public Persona(){  // Constructor N°1
        
    }
    public Persona(String nombre){  // Constructor N°2
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String dicreccion) {  // Constructor N°3
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = dicreccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
