public class MinMaxRecursion(){
    public class ArrayList<Integer> minmax(int []arr;int i,int j){
         
        ArrayList<Integer> list=new ArrayList<>();
        int max,min;
        if(i==j){//problem is small
            list.add(0,arr[i]);
            list.add(1,arr[i]);
            return list;   
        }
        if(i=j-1){//problem is small 2 ele.
           if(arr[i]>arr[j]){
            list.add(0,arr[i]);
            list.add(1,arr[j]);
            return list; 
           }
        }
        else{ //problem is large
            int mid=(i+j)/2;
           ArrayList<Integer>leftlist= minmax(arr,i,mid);
           ArrayList<Integer>righttlist=minmax(arr,mid+1,j);
            min=Math.min(leftlist)
           
            
        }

    }
    public static void main(string[] args){
        int[] arr={8,12,0,-6,15,20,3,64,9};
        int n=arr.length;
        int i=0;
        int j=n-1;
           minmax(arr,i,j);
           int min=list.get(0);
           int max=list.get(1);
           
    }
}