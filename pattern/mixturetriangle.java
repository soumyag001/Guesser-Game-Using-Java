public class mixturetriangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){ //rows
       if(i%2!=0){
            for(int j=1;j<=i;j++){ //col
            System.out.print(j +" ");
              

            }
        }
        else if(i%2==0){
            
            for(int j=1;j<=i;j++){ //col
                System.out.print((char)(j+64) +" ");
                  
        }
    }
            System.out.println();
    }
}
}
