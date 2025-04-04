import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.print("enter length of the array: ");
        int n=sc1.nextInt();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter elements: ");
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        boolean flag=true;
        for(int i=1;i<n-1;i++){
            for(int j=0;j<n-1;j++){
             if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=false;
            }
           
            }
            if(flag==true) break;
        }
        System.err.print("sorted array is: " );
        for (int i : arr) {
            System.out.print(i);
            System.out.print( " ");
        }
       
    }
}
