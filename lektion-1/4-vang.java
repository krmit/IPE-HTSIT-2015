import java.util.*;
 
public class uppg_04 {
 
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
               
                System.out.println("ange sfärens radie");
               
                double radie = sc.nextDouble();
               
                double volym = ((4*Math.PI)*Math.pow(radie, 3))/3;
               
                System.out.println(volym);
 
        }
 
}

// Samma här på skillnad mellan float och longsom jag sa i tidigare kapitel. Jag måste andå använda double
// för att kunna hantera Math.pow senare i programmet.
