    import java.util.Scanner;
     
    public class uppg_03 {
     
            /**
             * @param args
             */
            public static void main(String[] args) {
                   
                    Scanner sc = new Scanner(System.in);
                   
                    System.out.println("ange talet som ska upphöjas");
                   
                    float tal = sc.nextLong();
                   
                    double klart = Math.pow(tal, 32);
                   
                    System.out.println(klart);
     
            }
     
    }
     
    // angående vilket man använder float eller long så beror det på hur många siffror man vill ska kunna hanteras. I detta
    // fallet använder jag double mot slutet ändå så att jag ka använda Math.pow(); utan problem

