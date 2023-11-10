package test;


public class TestArreglos {
    public static void main(String[] args) { 
        int edades[] = new int [3]; 
        System.out.println("edades = " + edades);
        
        edades[0] = 17;

        edades[1] = 12; 
        edades[2] = 15;
        //edades[3] = 10; //fuera de rango, error en tiempo de ejecución
        System.out.println("edades 0 = " + edades[0]);
        System.out.println("edades 1 = " + edades[1]); 
        System.out.println("edades 2 = " + edades[2]);
        //Recorremos todo el arreglo con un ciclo for de índice 0 a índice 2
        for(int i = 0; i < edades.length; i++){
            System.out.println("Edades y sus elementos "+i+": "+edades[i]);
                                     
        }        

    }
}