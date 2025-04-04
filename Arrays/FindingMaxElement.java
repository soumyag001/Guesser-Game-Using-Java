import java.util.Scanner;

public class FindingMaxElement {
    public static void main(String[] args) {
        //length
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array length:");
        int n=sc.nextInt();
        //Input elements
        int []arr=new int[n];
        Scanner sc1=new Scanner(System.in);
        System.out.print("enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc1.nextInt();
        }
        //solution
       // int max=arr[0];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
               if(arr[i]>max){
                max=arr[i];
               }
        }
        System.out.println("max value:" +max);
    }
}
