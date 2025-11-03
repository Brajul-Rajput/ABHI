import java.util.Scanner;
public class A44 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    if(n>=18){
        System.out.println("Eligible for voting");
    }
    else{
        System.out.println("Not eligible for voting");  
    }
    sc.close();
   } 
}
