import java.util.*;
public class A25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        if((n&1)==0){
            System.out.println(n+" is even number");
        }
        else{
            System.out.println(n+" is odd number");
        }
        sc.close();
    }
}
