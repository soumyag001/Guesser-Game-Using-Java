import java.util.Scanner;
public class reverseWords {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a sentence: ");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        int n=sb.length();
        int i=0;int j=0;
        while(j<n){
            if(sb.charAt(i)!=' '){
                j++;
            }
            else{
                reverse(sb,i,j-1);
                i=j+1;
                j=i;
        }
        if(j==n-1){
            reverse(sb,i,j-1);
        }
        }
        System.out.println(sb);
        
    }
    public static void reverse(StringBuilder sb,int i,int j){
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
            
        }
    }


}
