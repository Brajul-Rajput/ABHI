import java.util.Scanner;
public class A6 {
    // input of datatype
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a=sc.nextInt();
        System.out.println("You entered: " + a);
        System.out.println("Enter a float:");
        float b=sc.nextFloat();
        System.out.println("You entered: " + b);
        System.out.println("Enter a double:");
        double c=sc.nextDouble();
        System.out.println("You entered: " + c);
        System.out.println("Enter a long:"); 
        long d=sc.nextLong();
        System.out.println("You entered: " + d);
        System.out.println("Enter a string:");
        String e=sc.next();
        System.out.println("You entered: " + e);
        System.out.println("Enter a boolean:");
        boolean f=sc.nextBoolean();
        System.out.println("You entered: " + f);
        System.out.println("Enter a byte:");
        byte g=sc.nextByte();
        System.out.println("You entered: " + g);
        System.out.println("Enter a short:");
        short h=sc.nextShort();
        System.out.println("You entered: " + h);
        System.out.println("Enter a char:");
        char  i=sc.next().charAt(0);
        System.out.println("You entered: " + i);
        System.out.println("Enter a line of text:");
        sc.nextLine(); // consume the leftover newline
        String j=sc.nextLine();
        System.out.println("You entered: " + j);
            
        sc.close();
    }
}
