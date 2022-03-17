package ejercicio7tp1;
import java.util.Scanner;
public class Ejercicio7TP1 {

    public static void main(String[] args) {
     Scanner scanf = new Scanner (System.in);
     int a=174, b=0;
     
     while (a != b) {
         System.out.print("ingrese un numero \n");
         b = scanf.nextInt();
         if ( a > b ) { System.out.print("tu numero es menor \n"); }
         if ( a < b ) { System.out.print("tu numero es mayor \n"); }      
     }
    System.out.print("el numero es 174");
    }
    
}
