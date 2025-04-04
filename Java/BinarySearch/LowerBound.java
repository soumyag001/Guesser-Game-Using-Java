import java.util.Scanner;
public class LowerBound {
    public static void main(String[] args) {
        int[] arr={10,20,30,30,40,50,60,70};
        Scanner sc=new Scanner(System.in);
        System.out.print("enter taeget: ");
        int target=sc.nextInt();
        int n=arr.length;
        int low=0;
        int high=n-1;
        int lb=n;
        while(low<=high){
            int mid=(high-low)/2+low;
            if(arr[mid]>=target) {
                lb=Math.min(lb,mid);
                high=mid-1;
            }
            else low=mid+1;
          
        }
       System.out.println(lb);
    }
}
