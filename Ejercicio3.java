package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
      Scanner scanf = new Scanner (System.in);
      
      int num, i=1, r=1;
      System.out.print("ingrese el numero a factorear");
      num = scanf.nextInt();
      
      if (0<=num) {  
          while (num>=i) {
          r = i * r;
              i++;
      }
      }
      System.out.print("el factorial es:" +r);
        
  
    }
    
}
