
import java.util.Scanner;

public class countvowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name: ");
        String str=sc.nextLine();
        int n=str.length();
        int count =0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(isvowel(ch)==true) count++;
        }
System.out.println(count);
    }
    public static boolean isvowel(char ch){
        if(ch=='a' || ch=='A') return true ;
        if(ch=='e' || ch=='E') return true ;
        if(ch=='i' || ch=='I') return true ;
        if(ch=='o' || ch=='O') return true ;
        if(ch=='U' || ch=='u') return true ;
        return false;
    }
}
