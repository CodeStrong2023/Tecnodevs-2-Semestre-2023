package domain;


public class Empleado extends Persona{
    @Override
    public void impirmir(){
        System.out.println("Método impirmir desde la clase hija");
    }
}