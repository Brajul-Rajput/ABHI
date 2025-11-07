public class B1 {
    public static void main(String[] args) {

        demo d=new demo();
        d.disp();
        {
         int b=20;
            String nae="hi";
            System.out.println(b);
            System.out.println(nae);
        
        }
    
    }
}
class demo{
    int a=10;
    String name="hello";
     void disp(){
        System.out.println(this.a);
        System.out.println(this.name);
     }
     
}
