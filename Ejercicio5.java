package ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
       Scanner scanf = new Scanner(System.in);
       int a, i, f;
       
       System.out.print("ingrese el numero");
       a = scanf.nextInt();
     
       for (i=1; i<=10; i++) {
           f = i * a;
           System.out.print(f + ",");
       }
    }
    
}
