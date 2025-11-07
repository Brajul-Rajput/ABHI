import java.util.*;
public class B3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     String name[]=new String[5];
     for(int i=0;i<name.length;i++){
        name[i]=sc.nextLine();
     }
     System.out.println("print all the name  :");
     for(String prt:name){
        System.out.print(prt+" ");
     }
    }
}
