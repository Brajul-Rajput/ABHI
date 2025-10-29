import java.util.Scanner;
public class A17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                System.out.println(i);
                sum=sum+i; 
            }
        }
            System.out.println("Sum of factors is: "+sum);
            sc.close();
            }
            
        }
    

