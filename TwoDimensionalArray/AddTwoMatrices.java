public class AddTwoMatrices {
    public static void main(String[] args) {
       int[][] arr1={{11,10,12},{2,4,3},{4,5,6}};
       int[][]arr2={{11,10,12},{2,4,3},{4,5,6}};
       int n1=arr1.length;
       int n2=arr2.length;
       int m1=arr1[0].length;
       int m2=arr2[0].length;
       int l=n1+m1;
       int m=n2+m2;
       int[][] res=new int[n1][m1];
       for(int i=0;i<n1;i++){
            for(int j=0;j<m1 ;j++){
                res[i][j]=arr1[i][j]+arr2[i][j];
            }
       }
       for(int i=0;i<n1;i++){
        for(int j=0;j<m1 ;j++){
          System.out.print(res[i][j] +" ");
        }
        System.out.println();
   }
    }
}
