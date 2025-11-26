public class A52 {
   public static void main(String[] args) {
    int arr[]={3,1,3,4,5,3};
   System.out.println( linearsearch(arr,5 ));
   } 

public static int linearsearch(int arr[],int target){
for(int i=0;i<arr.length;i++){
    if(arr[i]==target){
        return i;
    }
}
        return -1;
}

}

