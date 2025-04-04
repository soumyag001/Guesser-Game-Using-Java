import java.util.Scanner;
import java.util.*;

public class Sort1s0s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of array:");
        int n=sc.nextInt();
         int[] arr=new int[n];
        Scanner sc2=new Scanner(System.in);
        System.out.print("enter array elements(0 & 1):" +" ");
        for(int i=0;i<n;i++){
            arr[i]=sc2.nextInt();
        }
        System.out.print("Array:" +" ");
        for (int ele : arr) {
            System.out.print( ele +" ");
        }
        //calculating no. of 0s & 1s
            int ones=0;
            int zeroes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                ones=ones+1;
            }
           else if(arr[i]==0){
                zeroes=zeroes+1;
            }
        }
        System.out.print("\n1s: "+ones +"\n0s: " +zeroes);
        for(int i=0;i<zeroes;i++){
            arr[i]=0;
        }
        for(int j=zeroes;j<n;j++){
            arr[j]=1;
        }
        System.out.print("\nsorted array: ");
        for (int ele : arr) {
            System.out.print( +ele+" ");
        }
    }
}
