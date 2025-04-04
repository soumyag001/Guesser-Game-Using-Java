
import java.util.ArrayList;
public class basics {
    public static void main(String[] args) {
        
    
    ArrayList<Integer> arr= new ArrayList<>(6);
    arr.add(0,10);//initializing
    arr.add(1,20);
    arr.add(2,30);
    arr.add(3,40);
    arr.add(4,50);
    arr.add(5,60);
    System.out.println(arr);

//    for(int i=0;i<6;i++){
//        System.out.print(arr.get(i) +" ");
//    }

arr.set(0,1);//changing value
arr.add(90); //adding new value
System.out.println(arr);//printing elements w/o loop
arr.remove(2);//removing element at index
System.out.println(arr);
}
}
