import java.util.Scanner;

public class NumberSpiral2 {
    public static void main(String[] args) {
        
    
     Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
               int a =i,b=j;
               if(i>n){
                a=2*n-i;
               }
               else if(j>n){
                b=2*n-j;
               }
                    System.out.print(Math.min(a,b) +" ");
                
            }
            System.out.println();
        }
}
}