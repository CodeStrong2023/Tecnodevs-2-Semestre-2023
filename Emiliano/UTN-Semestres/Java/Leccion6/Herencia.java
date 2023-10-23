package Java.Leccion6;

public class Herencia {
    // Atributos de herencia 
    protected String nombre;
    protected char gernero;
    protected int edad;
    protected String direccion;

    // Contructor vacio: este es para crear objetos sin necesidad de inicializar los atributos de la clase
    public Herencia(){ // Contructor 1

    }

    public Herencia(String nombre, char gernero, int edad, String direccion){
        this.nombre = nombre;
        this.gernero = gernero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public char getGenero(){
        return this.gernero;
    }

    public void setGenero(char genero){
        this.gernero = genero;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(",genero=").append(gernero);
        sb.append(",edad=").append(edad);
        sb.append(",direccion=").append(direccion);
        sb.append(", ").append(super.toString());
        sb.append("}");
        return sb.toString();
    }
}
