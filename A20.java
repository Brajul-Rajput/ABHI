public class A20 {
    public static void main(String[] args) {
        int num=7;
        int rem=0;
        while(num>0){
             rem=num%2;
           // sum=sum+rem;
            num=num/2;
        }
        System.out.println("Number of 1's in binary representation: "+rem);
    }
}
