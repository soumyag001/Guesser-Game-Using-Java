import java.util.Scanner;
public class evenpositionA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        int n=str.length();
        String t="";
        for(int i=0;i<n;i++){
            if(i%n==0){
                t=t+'a';
            }
            else{
                t=t+str.charAt(i);
            }
        }
        System.out.print(t);
    
    }
}
