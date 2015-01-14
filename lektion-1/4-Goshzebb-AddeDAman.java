import java.util.*;
 
public class uppg_04 {
 
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
System.out.println("Skriv radien:");
double tal = sc.nextDouble();

System.out.println(((Math.PI)*4*tal*tal*tal)/3);
}

}
