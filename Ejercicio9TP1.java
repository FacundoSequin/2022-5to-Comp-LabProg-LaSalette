package ejercicio9tp1;
import java.util.Scanner;
        
public class Ejercicio9TP1 {


    public static void main(String[] args) {
        double a, r, pi, d;
      Scanner scanf = new Scanner(System.in);
        System.out.print("ingrese el radio");
        r = scanf.nextDouble();
        d = r * 2;
        System.out.print("el diametro es" + d);
        pi = Math.PI;
        a = pi * r * r; 
        System.out.print("el area es" + a);
    }
    
}
