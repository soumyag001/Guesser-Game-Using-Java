
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr ={1,2,3,6,7};
        Scanner sc=new Scanner(System.in);
        System.out.print("enter x(1,2,3,6,7):");
        int x=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==x){
                System.out.print("found at index: " +arr[i] +" and " +arr[j]);
                flag=true;
                break;
            }
            if(flag==true)
            {
                break;
            }   
        } 
    }
    if(flag==false){
        System.out.println("not found");
        }
}
}