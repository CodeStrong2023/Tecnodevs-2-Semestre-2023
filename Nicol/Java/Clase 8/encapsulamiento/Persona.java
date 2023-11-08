package dominio;

public class Persona {
    //Atributos
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    //Contructor
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSueldo(){
        return sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public boolean isEliminado(){
        return eliminado;
    }

    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }

    @Override
    public String toString(){//Convierte en una cadena cada atributo
        return "Persona [Nombre: nombre: "+this.nombre+
                ",sueldo: "+this.sueldo+
                ",eliminado: "+this.eliminado+"]";   

    }

    public void getNombre(String melina) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getSueldo(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void isEliminado(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
