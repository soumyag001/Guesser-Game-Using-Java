public class mergearrays {
    

  public static void main(String[] args) {
  int[] arr1={1,3,5,7};
  int[] arr2={2,4,6,8,9,10};
  int n=arr1.length;
  int m=arr2.length;
  int[] arr= new int[m+n];
  int i=n-1,j=m-1,k=(m+n)-1;
 while(i>=0 && j>=0){
      if(arr1[i]>=arr2[j]){
        arr[k]=arr1[i];
        i--;
        
      }
      else {
        arr[k]=arr2[j];
        j--;
      
      }
      k--;
    }
    while (i >= 0) {
        arr[k] = arr1[i];
        i--;
        k--;
    }
    while (j >= 0) {
        arr[k] = arr2[j];
        j--;
        k--;
    }

  for (int ele : arr) {
    System.out.println(ele);
  }
}
}


