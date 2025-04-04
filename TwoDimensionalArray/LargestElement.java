public class LargestElement {
    public static void main(String[] args) {
        int[][] arr={{10,200,30},{2,100,90}};
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                    
                }
            }
        }
        System.out.println(max);
    }
}
