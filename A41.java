import java.util.*;
//Write a program to calculate the average of two numbers.
public class A41 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter one numbers:");
      int a=sc.nextInt();
      System.out.println("Enter second number:");
      int b=sc.nextInt();
      int avg=(a+b)/2;
        System.out.println(avg);  
        sc.close();
    }
}
