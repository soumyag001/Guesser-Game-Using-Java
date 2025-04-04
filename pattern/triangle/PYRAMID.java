import java.util.Scanner;

public class PYRAMID {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){ //rows
            for(int j=1;j<=(n-i);j++){ //col
                System.out.print(" " + " ");
                
            }
            for(int j=1;j<=2*i-1;j++){ //spaces
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
