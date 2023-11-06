package Federico.Java.Clase_1;

public class Federico_Ejercicio_1_1 {
    public static void main(String[] args){
        int count = 0; 

        // while
        while (count < 7) {
            System.out.println(count);
            count++;
        }


        // do-while
        count = 0;
        do {
            System.out.println(count);
            count++;
        } while (count < 6);

        // for-break
        for (count = 0; count < 7; count++) {
            if (count % 2 == 0) {
                System.out.println(count);
                break;
            }
        }
        
        // for-continue
        count = 0;
        for (count = 0; count < 7; count++) {
            if (count % 2 != 0)
                continue; 
            System.out.println(count);
        }

        // labeled for-continue
        counter:
        for (count = 0; count < 7; count++) {
            if (count % 2 != 0)
                continue;
            System.out.println(count);
        }

    }
}