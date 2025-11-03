import java.util.*;
//Write a program to calculate the sum of first N natural numbers.
public class A30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The sum of first "+n+" natural numbers is: "+sum);
sc.close();
    }
}
