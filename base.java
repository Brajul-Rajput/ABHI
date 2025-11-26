public class base {
public static void main(String[] args) {
    /* 
    shape s=() ->{
     System.out.println("this is shape");
     System.out.println("this is shape interface implemented using lambda expression");
     System.out.println("this is shape lambda expression");
     System.out.println("this interface implemented using lambda expression");
    };
   s.printshape();
    calculator c=(a,b) -> a+b;
    System.out.println("the sum is "+c.sum(5,10));
    calculator c2=(a,b)->a*b;
    System.out.println(c2.sum(3,6));
    */
    numbertype num=(n)->{
        if(n%2==0){
            System.out.println(n+" is even number");
        }
        else{
            System.out.println(n+" is odd number"   );
        }
    };
    num.printnumbertype(7);
    num.printnumbertype(12);
}
}
