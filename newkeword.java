public class newkeword {
    int a=10;
    public static void main(String[] args) {
        newkeword a1=new newkeword();
        System.out.println(a1.a);
        abc a2=new abc();
        System.out.println(a2.s);
        a2.show();
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
            System.out.println(arr[i]);

    }
}
}
class abc{
    int s=23;
    void show(){
        System.out.println("hello");
    }
}
