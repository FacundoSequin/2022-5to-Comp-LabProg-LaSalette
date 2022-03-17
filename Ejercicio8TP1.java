package ejercicio8tp1;
import java.util.Scanner;

public class Ejercicio8TP1 {

    public static void main(String[] args) {
        int a, b = 0, i, j;
        Scanner scanf = new Scanner(System.in);
        System.out.print("ingrese la cantidad de numeros");
        i = scanf.nextInt();
        for (j = 0; j < i; j++) {
            System.out.print("ingrese un numero");
            a = scanf.nextInt();
            b = b + a;
        }
        System.out.print("el resultado es" + b);
    }
    
}
