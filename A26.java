import java.util.*;
public class A26 {
    //reverse of a number0
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int rev=n%10;
            sum=sum*10+rev;
            n=n/10;
        }
        System.out.println("the reverse number is "+sum);
    }
}
