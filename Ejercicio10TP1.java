package ejercicio10tp1;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio10TP1 {


    public static void main(String[] args) {   
        Scanner scanf = new Scanner(System.in);
        
        int codigo, i, a;
        double total;
        ArrayList<Integer> sueldo = new ArrayList();
        ArrayList<Integer> horas = new ArrayList();
   
        for (i=0; i<5; i++) {
                System.out.print("ingrese el sueldo por hora de el empleado nro " + i);
                a = scanf.nextInt();
                sueldo.add(a);
                System.out.print("ingrese las horas trabajadas por empleado nro" + i);
                a = scanf.nextInt();
                horas.add(a);
                        }
        
        for (i=0; i<5; i++) {
            if (horas.get(i) <= 40) { total = horas.get(i) * sueldo.get(i); }
            else { total = 40 * sueldo.get(i) + (horas.get(i) - 40) * sueldo.get(i) * 1.5; }
            System.out.print("el sueldo del empleado es " + total);
        }                
    }   
}
