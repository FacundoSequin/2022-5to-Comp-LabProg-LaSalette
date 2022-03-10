package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        int a;
        System.out.print("Ingrese el ano a calcular \n");
        Scanner scanf = new Scanner(System.in);
        a = scanf.nextInt();
        
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) { System.out.printf("Es bisiesto");  }
                
                else { System.out.printf("No es bisiesto"); }
            }
            else { System.out.printf("es bisiesto"); }
        } 
        else { System.out.printf("no es bisiesto"); }
        }
    }
    