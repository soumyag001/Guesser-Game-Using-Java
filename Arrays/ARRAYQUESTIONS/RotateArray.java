

public class RotateArray {
    public static void main(String[] args) {
        int [] arr={10,20,5,4,3,2,1};
        int n=arr.length;
        int k=5;
        int []res=new int[n];
        
            for(int i=0;i<n;i++){
                
                res[(i+k)%n]=arr[i];
                }
            
        
        for (int ele : res) {
            System.out.println(ele);
        }
        
    }
}
