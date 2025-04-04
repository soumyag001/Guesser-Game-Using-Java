public class INCnumbertriangle {
    public static void main(String[] args) {
        int a=1;
        for(int i=1;i<=5;i++){ //rows
            for(int j=1;j<=i;j++){ //col
                System.out.print(a +" ");
                a++;
            }
            System.out.println();
        }
    }
}
