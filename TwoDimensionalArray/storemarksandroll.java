import java.util.Scanner;

public class storemarksandroll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][2];
        for(int i=0;i<4;i++){
        System.out.print("enter roll no: ");
        arr[i][0]=sc.nextInt();
        System.out.print("enter marks: ");
        arr[i][1]=sc.nextInt();
        }
        System.out.print("Rno\tMarks\n");
        for(int i=0;i<4;i++){
            System.out.println(arr[i][0] +" \t"+arr[i][1]);
        }
    }
}
