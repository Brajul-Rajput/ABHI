import java.util.*;
//count number of digits in a number
public class A27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int count=0;
     if(n==0){
                System.out.println("the number of digits is 1");
                return;
            }
        while(n>0){
        
            n=n/10;
            count++;
                }
      
            
        System.out.println("the number of digits is "+count);
        sc.close();
    }
}
