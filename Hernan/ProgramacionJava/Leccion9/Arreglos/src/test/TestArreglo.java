
package test;

public class TestArreglo {
    public static void main(String[] args) {
        int edades[] = new int[3]; // lado izq. declaramos variable
                                   // lado der. instanciamos un objeto de tipo object
        System.out.println("edades = " + edades);
        
        edades[0] = 17;
        System.out.println("edades 0 = " + edades[0]);
        edades[1] = 23;
        System.out.println("edades 1 = " + edades[1]);
        edades[2] = 50;
        System.out.println("edades 2 = " + edades[2]);
        
        //edades[3] = 7;  // fuera de rango, error en tiempo de ejecución | no error de compilación
        
        for (int i = 0; i < edades.length; i++){
            System.out.println("edades y sus elementos "+i+": "+edades[i]);
            
        }
        
        
    }
}
