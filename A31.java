import java.util.*;
//Print all odd numbers from 1 to n
public class A31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i=i+2){
            System.out.print(i+" ");
        }
        sc.close();

    }
}
