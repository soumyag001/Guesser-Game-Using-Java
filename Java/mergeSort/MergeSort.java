

public class MergeSort {
    public static void mergesort(int []arr){
        int n=arr.length;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        if(n==1) return; //base case
         //copying elements
        for(int i=0;i<n/2;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i]=arr[i+n/2];
        }
        mergesort(a);
        mergesort(b);
        merge(a,b,arr);

    }
    public static int[] merge(int[] a,int[] b,int[] arr){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){arr[k]=a[i];
            i++;
        k++;
    }
        else{
            arr[k]=b[j];
            j++;
            k++;
        }
       
        }
        while(i<a.length)arr[k++]=a[i++];
        while(j<b.length)arr[k++]=b[j++]; 
        return arr;
    }
    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        int[] a={80,10,70,30,60,40,50,20};
        mergesort(a);
        print(a);
     

    }
}
