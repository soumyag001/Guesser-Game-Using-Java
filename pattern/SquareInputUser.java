import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class SquareInputUser {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);

    System.out.print("enter n:");

    int n=sc.nextInt();

    for(int i=1;i<=n;i++){ //rows
        for(int j=1;j<=n;j++){ //col
            System.out.print(j);
        }
        System.out.println();
    }
}
}