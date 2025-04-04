import java.util.Scanner;

public class Factorial {
 public static int factorial(int n){
    if(n==1) return 1;
    int ans=n*factorial(n-1);
    return ans;
 }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        int n1= factorial(n);
        System.out.println(n1);
    }
}
