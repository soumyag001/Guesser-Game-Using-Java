

import java.util.Scanner;

public class oddstarCrossSign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n(odd):");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){ //rows
            for(int j=1;j<=n;j++){ //col
                if(i==j || i+j==n+1){
                System.out.print("*" +" ");
                }
                else{
                    System.out.print(" " +" ");
                }
            }
            System.out.println();
        }
    }
}
