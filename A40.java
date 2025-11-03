import java.util.Scanner;
public class A40 {
    //Write a program to find the largest of three numbers.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value :");
        int a=sc.nextInt();
        System.out.println("Enter b value :");
        int b=sc.nextInt();
        System.out.println("Enter c value :");
        int c=sc.nextInt();
       
        if(a>b && a>c){
            System.out.println("a is largest");
        }
        else if(b>c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
        sc.close();
    }
}
