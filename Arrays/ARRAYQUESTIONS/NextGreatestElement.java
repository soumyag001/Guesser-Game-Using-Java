public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr={12,8,41,37,2,49,16,28,21};
        int n=arr.length;
        int[] arr2=new int[n];
        int max=Integer.MIN_VALUE;

        int k=0;
        
        for(int i=0;i<n-1;i++){
            for( int j=i+1;j<n;j++){
                if(arr[j]>max){
                    max=arr[j];
                
                }
            }
            arr2[k]=max;
            k++;
            max=Integer.MIN_VALUE;
    
        }
    
        arr2[k]=-1;
        
     for (int ele : arr2) {
        System.out.println(ele);
     }
    }
}
