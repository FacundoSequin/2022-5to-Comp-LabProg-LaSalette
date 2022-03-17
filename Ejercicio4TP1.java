/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4tp1;
import java.util.Scanner;
public class Ejercicio4TP1 {

    public static void main(String[] args) {
        int a, i;
        Scanner scanf = new Scanner (System.in);
        System.out.printf("Ingrese el numero");
        
        a = scanf.nextInt();
        
        for (i=1; i<=a; i++) {
            if (a % i == 0) { System.out.printf("%d,", i); }
        }
        
    }
    
}
