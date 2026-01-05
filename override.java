public class override {
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }
}

class A{
    void show(){
        System.out.println("hello A");
    }
}
class B extends A{
   @Override
    void show(){
        System.out.println("hello B");
    }
}