public class updatestringevenposition {
    public static void main(String[] args) {
        String s="physics wallah";
        String t="";
        int n=s.length();
        for(int i=0;i<n;i++){
            if(i%2==0){
                t=t+'a';
            }
            else t=t+s.charAt(i);
        }
        System.out.println(t);
    }
}
