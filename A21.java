import java.util.*;
public class A21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base:");
        int base=sc.nextInt();
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int pow=0;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem *(int)Math.pow(base,pow);
            pow++;
            n=n/10;
        }
        System.out.println("The decimal equivalent is: "+sum);
        sc.close();
    }
    
    
}
