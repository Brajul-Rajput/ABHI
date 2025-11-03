import java.util.*;
//WAP to find the greatest of two numbers.
public class A38 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number one : ");
    int n=sc.nextInt();
    System.out.println("enter the number two : ");
    int m=sc.nextInt();
    if(n>m){
        System.out.println(n+" is greater than "+m);
    }
    else if(m>n){
        System.out.println(m+" is greater than "+n);
    }
    else{
        System.out.println("both are equal");
    }
    sc.close();
   } 
}
