package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int a, b, c, p, mayor = 0, menor = 0, medio = 0;
        Scanner scanf = new Scanner(System.in);
        System.out.print("ingrese el primer numero");
        a = scanf.nextInt();

        System.out.print("ingrese el segundo numero");
        b = scanf.nextInt();

        System.out.print("ingrese el tercer numero");
        c = scanf.nextInt();

        if (a == b) {
            if (a == c) {
                System.out.printf("todos son iguales");
            } else {
                System.out.printf("A y B son iguales");
            }
        } else if (b == c) {
            System.out.print("B y C son iguales");
        } else if (a == c) {
            System.out.print("A y C son iguales");
        } else {
            System.out.print("todos son distintos");
        }

        p = (a + b + c) / 3;
        System.out.printf("  el promedio es %d", p);

        p = a + b + c;
        System.out.printf(" la suma de los numeros es %d", p);

        if (a > b && b > c) { mayor = a; if (b>c) { medio = b; menor = c; } else { medio = c; menor = b; } }
        if (b > a && b > c) { mayor = b; if (a>c) { medio = a; menor = c; } else { medio = c; menor = a; } }
        if (c > b && b > a) { mayor = c; if (b>a) { medio = b; menor = a; } else { medio = a; menor = b; } }

        p = menor * mayor;
        System.out.printf("el multiplo de los numeros es %d ", p);
        System.out.printf("Medio %d ", medio);
        
        while (medio>=1) { 
            medio = medio/3; 
            if (medio == 0) { System.out.printf("medio es divisible por 3"); } 
        }
        
    }

}
