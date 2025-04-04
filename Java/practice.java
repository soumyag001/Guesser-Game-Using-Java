public class practice{
    public static void main(String[] args) {
        int[] arr={10,2,4,5,6};
        int n=arr.length;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            {
            if(arr[i]>max1) 
            max2=max1;
            max1=arr[i];
        }
        }
           
        System.out.println(min);
    }
}