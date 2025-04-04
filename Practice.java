import java.util.Scanner;
public class Practice {
   
    public static void main(String[] args) {
     int[] a=new int[6];
     int n=a.length;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter elements: ");
     for(int i=0;i<n-1;i++){
        a[i]=sc.nextInt();
     }
     int pos=2;
  
     for(int i=n-2;i>=pos-1;i--){
        a[i+1]=a[i];
     }
     a[pos-1]=2;
     for (int x : a) {
      System.out.println(x);
     }
}
}
