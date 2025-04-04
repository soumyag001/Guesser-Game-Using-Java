import java.util.Scanner;
public class TempCodeRunnerFile {
   
    public static void main(String[] args) {
     int[] a=new int[6];
     int n=a.length;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter elements: ");
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
     }
     
  
     for(int i=n-1;i>0;i++){
        a[i]=a[i-1];
     }
     a[0]=2;
}
}
