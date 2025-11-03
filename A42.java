import java.util.*;
//factorial of a number
public class A42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int sum=1;
        for(int i=1;i<=n;i++){
            sum=sum*i;
        }
        System.out.println("factorial of "+n+" is : "+sum);
        sc.close();
    }
}
