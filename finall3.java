public class finall3 {
    public static void main(String[] args) {
        theif t = new theif();
        t.pin();
        t.shownumber();
    }
}

 final class atmpin{
    void pin(){
        System.out.println("1243");
    }
    void shownumber(){
        System.out.println("9876543210");
    }
}
class theif extends atmpin{
    @Override
    void pin(){
        System.out.println(1243);

    }
    @Override
    void shownumber(){
        System.out.println("9876543210");
}
}
