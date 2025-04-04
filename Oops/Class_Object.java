import Bank;
class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("write");
         
    }
    public void print(){System.out.println(this.color);}
}

public class Class_Object {
 public static void main(String[] args) {
    
   Pen pen1=new Pen();
    Pen pen2=new Pen();
    pen1.color="blue";
    pen2.color="black";
pen1.print();
pen2.print();
    //packages
    Bank.Account acc= new Bank.Account();
    acc.name="customer";
}
}
