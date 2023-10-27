package Java.Leccion9;
public class Arreglos {
    public static void main(String[] args) {
        int edades[] = new int [3];//Lado derecho:intanciamos un objeto de tipo object
        System.out.println("Edades: " + edades);
        
        edades[0] = 17;
        System.out.println("edades 0: " + edades[0]);

        edades[1] = 22;
        System.out.println("edades 1: " + edades[1]);

        edades[2] = 18;
        System.out.println("edades 2: " + edades[2]);

        //edades[3] = 7;//Error en tiempo de ejecucion

        for(int i = 0; i < edades.length; i++){
            System.out.println("Edades y sus elementos" + i +":"+edades[i]);
            
        }

    }
}
