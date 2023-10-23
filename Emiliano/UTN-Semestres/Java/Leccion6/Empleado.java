package Java.Leccion6;

public class Empleado extends Herencia{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;   
   
    public Empleado(String nombre,double sueldo){
        this.idEmpleado = ++Empleado.contadorEmpleados;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado(){
        return this.idEmpleado;
    }

    public double getSueldo(){
        return this.sueldo;
    }  

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append("}");
        return sb.toString();
    }
}
