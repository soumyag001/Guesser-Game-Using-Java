

public class TwoPointer {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70};
        System.out.print("Original Array: ");
        for (int ele : arr) {
            System.out.print( ele + " " );
        }
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
        System.out.print("\nreversed array: ");
        for (int ele : arr) {
            System.out.print( ele +" ");
        }
    }
        public static void swap(int []arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

