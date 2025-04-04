import java.util.Scanner;
public class DecresingOrder {
    public static void main(String[] args) {
        int[] arr={1,2,6,4,5,10,11};
        int n=arr.length;
       for(int j=0;j<n-1;j++){ 
        for(int i=0;i<n-1-j;i++){
            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
