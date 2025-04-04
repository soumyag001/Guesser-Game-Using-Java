
import java.util.Scanner;
public class ReverseWithoutExtraArray {
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter k:");
        int k=sc.nextInt();
       
        Scanner sc1=new Scanner(System.in);
    
        System.out.print("Enter Size of array:");
        int n=sc.nextInt();
       
        int[] arr=new int[n];
        Scanner sc2=new Scanner(System.in);
        System.out.print("enter array elements:" +" ");
        
        for(int i=0;i<n;i++){
            arr[i]=sc2.nextInt();
        }
        System.out.print("Array: ");
        for (int ele2 : arr) {
            System.out.print( +ele2 +" ");
        }
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        System.out.print("\nReversed Array: " );
        for (int ele : arr) {
            System.out.print( +ele +" ");
        }
    }
    public static void reverse(int [] arr, int i,int j){
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
