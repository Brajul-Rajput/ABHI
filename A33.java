import java.util.*;
//WAP to find the sum of even numbers from 1 to n.
public class A33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =sc.nextInt();
    int sum=0;
    for(int i=0;i<=n;i=i+2){
        sum=sum+i;
    }
    System.out.println("The sum of even numbers is : "+sum);
    sc.close();
    }

}
