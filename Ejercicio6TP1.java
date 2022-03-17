
package ejercicio6tp1;
import java.util.Scanner;

public class Ejercicio6TP1 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner (System.in);
        int a, b, z = 0, i;
        System.out.print("ingrese el numero de inicio");
        a = scanf.nextInt();
        System.out.print("ingrese el numero de fin");
        b = scanf.nextInt();
        
        for (i = a; i <= b; i++) {
            if ( i % 5 == 0 ) { z = z + i ; }
            }
        System.out.print("el resultado es " + z);
    }
    
}
