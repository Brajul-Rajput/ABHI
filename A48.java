import java.util.*;
public class A48 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int sal=sc.nextInt();
      if(sal<=10000){
        System.out.println("no tax");

      }
      else if(sal>10000 && sal<=20000){
        double tax=sal*0.2;
        System.out.println(tax);
      }
      else{
        double tax=sal*0.3;
        System.out.println(tax);
      }


       
    }
}
