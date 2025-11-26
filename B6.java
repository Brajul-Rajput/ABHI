import java.util.*;

public class B6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("print the first array : ");
        for(int x:a){
            System.out.println(x+" ");
        }
        System.out.println("print the second arrays : ");
        for(int i=0;i<b.length;i++){
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }
    }
}
