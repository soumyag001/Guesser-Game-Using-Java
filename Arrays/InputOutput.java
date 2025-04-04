import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        //length input
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array length:");
        int n=sc.nextInt();
        //array input
        Scanner sc1=new Scanner(System.in);
        int[] arr = new int[n];
        int m=arr.length;//finding length of array
        System.out.println("length of arrray:" +n);
        System.out.print("enter inputs:"+" " );
        for(int i=0;i<n-1;i++){
            arr[i]=sc1.nextInt();
        }
        //output
        System.out.print(" outputs are:");
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
