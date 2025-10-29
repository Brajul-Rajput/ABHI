import java.util.*;
public class A14 {
    // if else statement
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
    System.out.println("Enter your age:");
        int n=sc.nextInt();
        if(n>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
        sc.close();

    }
}
