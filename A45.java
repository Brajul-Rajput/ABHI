import java.util.*;
// Write a program to print multiplication table of a number n.
public class A45 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number : ");
    int n=sc.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(n+" * "+i+" = "+(n*i));
    }
    sc.close();
  }  
}
