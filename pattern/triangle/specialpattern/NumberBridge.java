

import java.util.Scanner;

public class NumberBridge {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            System.out.print(i +" ");
        }
        System.out.println();
        n--;
        for(int i=1;i<=n;i++){ 
            for(int j=1;j<=(n+1-i);j++){ 
                System.out.print(j +" ");
                
            }
           for(int j=1;j<=(2*i-1);j++){
                System.out.print(" " + " ");
            }
            for(int j=1;j<=(n+1-i);j++){ 
                System.out.print("*" +" ");
                
            }  
            System.out.println();
        }
    }
}
