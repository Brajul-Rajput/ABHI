public class finall2 {
    public static void main(String[] args) {
        theif t = new theif();
        t.pin();
        t.showpin();
    }
}
class atmpin{
  void pin(){ //final method 
    System.out.println("0956");
}
void showpin(){
    System.out.println("your pin is  not safe");
}
}
class theif extends atmpin  {
    @Override
    void pin(){
        System.out.println("0956");
    }
    @Override
    void showpin(){
        System.out.println("your pin is  safe");
    }
}
