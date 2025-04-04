import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        Scanner sc1=new Scanner(System.in);
        System.out.print("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc1.nextInt();
        }
    Scanner sc2=new Scanner(System.in);
    System.out.print("enter target: ");
    int target=sc2.nextInt();
    Arrays.sort(arr);  

    //BINARY SEARCH
    boolean flag=false;
    int low=0;
    int high=n-1;
    int x=0;
    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]>target) high=mid-1;
        else if(arr[mid]<target) low=mid+1;
        else if(arr[mid]==target) {
            flag=true;
            x=mid;
            break;
        }
        }
        if(flag==true) System.out.print("target found at index: " +x );
        else System.out.println("target not found");
    }
}
