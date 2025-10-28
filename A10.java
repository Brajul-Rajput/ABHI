public class A10 {
    // ternary operator 
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int max;
        max=(a>b)?a:b;
        System.out.println("Maximum value is: " + max);

      int x=23;
      int y=89;
      int z=56;
      int large=(x>y)?(x>z?x:z):(y>z?y:z);
        System.out.println("Largest value is: " + large);
    }
}
