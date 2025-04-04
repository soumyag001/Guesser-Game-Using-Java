
import java.util.Scanner;
public class MergeTwoArrays{
  public static void main(String[] args) {
  int[] arr1={1,3,5,7};
  int[] arr2={2,4,6,8,9,10};
  int n=arr1.length;
  int m=arr2.length;
  int[] arr= new int[m+n];
  int i=0,j=0,k=0;
 while(i<n && j<m){
      if(arr1[i]<=arr2[j]){
        arr[k]=arr1[i];
        i++;
        
      }
      else {
        arr[k]=arr2[j];
        j++;
      
      }
      k++;
    }
if(i==n){// arr1 is finished now take all elements from arr2
  while(j<m){
    arr[k]=arr2[j];
    k++;
    j++;
  }
}
if(j==m){// arr2 is finished now take all elements from arr1
  while(i<n){
    arr[k]=arr1[i];
    k++;
    i++;
  }
}
  for (int ele : arr) {
    System.out.println(ele);
  }
}
}
