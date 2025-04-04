

public class QuickSort {
    public static void swap(int []a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void quicksort(int[]a,int lo,int hi){
        if(lo>=hi) return;
        //place pivot element to its right place
        int idx=partition(a,lo,hi);
        //sorting
        quicksort(a,lo,idx-1);
        quicksort(a,idx+1,hi);
    }
    public static int partition(int[]a,int lo,int hi){
        int pivotele=a[lo], pivotidx=lo;
        int n=a.length;
        int count=0;
        for(int i=lo+1;i<n;i++){
            if(a[i]<=pivotele) count++;
        }
       int correctidx=pivotidx+count;
        swap(a,pivotidx,correctidx);
        //partition
        int i=lo,j=hi;
        while(i<correctidx && j>correctidx){
            if(a[i]<=pivotele) i++;
            else if(a[j]>pivotele)j--;
            else if(a[i]>pivotele && a[j]<=pivotele) swap(a,i,j);

        }
        return correctidx;
    }
    public static void print(int[] a){
        int n=a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={4,9,7,1,2,3,6,5,8};
        int n=arr.length;
        int lo=0,hi=n-1;
        quicksort(arr,lo,hi);
        print(arr);
    }
}
