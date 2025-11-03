import java.util.*;
// Write a program to find the ASCII value of a character.
public class A36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);
        int a=(int)ch;
        System.out.println("The ASCII value of "+ch+" is: "+a);
        sc.close();
    }
}
