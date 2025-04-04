import java.util.Scanner;
import java.util.ArrayList;
public class pracice {
  public static void main(String[] args) {
int[] arr={2,4,8,99,9,10,1};
int n=arr.length;
int max=Integer.MIN_VALUE;
int max2=Integer.MIN_VALUE;
for(int i=0;i<n;i++){
  if(arr[i]>max2){
    max2=max;
    max=arr[i];
    
  }
}
System.out.println(max2);

    }
}

