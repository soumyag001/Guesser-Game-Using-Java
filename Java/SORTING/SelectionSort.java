import java.util.Scanner;
public class SelectionSort {
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
        for(int j=0;j<n-1;j++){
        int min=Integer.MAX_VALUE;
        int mindx=-1;
        for(int i=j;i<n;i++){
            if(arr[i]<min) {
            min=arr[i];
            mindx=i;
        }
        }
        int temp=arr[j];
       arr[j]=arr[mindx];
       arr[mindx]=temp;
    }
    for (int i : arr) {
        System.out.print(i);
        System.out.print(" ");
    }
    }
}
