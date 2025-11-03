import java.util.*;
// even /odd
public class A23{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if((n&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");

        }
        sc.close();
    }

}