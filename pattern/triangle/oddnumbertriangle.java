public class oddnumbertriangle {
    
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){ //rows
            for(int j=1;j<=i;j++){ //col
                System.out.print((2*j-1));
            }
            System.out.println();
        }
    }
}
