import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        
        //size
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n=sc.nextInt();
        //Input elements
        int []arr=new int[n];
        Scanner sc1=new Scanner(System.in);
        System.out.print("enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc1.nextInt();
        }
        //element to be Searched
        Scanner sc2=new Scanner(System.in);
        System.out.print("enter target element:");
        int x=sc2.nextInt();
        //solution
        boolean flag=false;// element not found
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                
                    System.out.print("element found at index:" +i);
                    flag=true;
                break;   
            }
            
        }
        if(flag==false){
            System.out.print("element not found");
        }
        
    }
}
