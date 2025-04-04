class Shape{
    String color;
    String type;
    int l;
    int h;

}
class Triangle extends Shape{


public void area(int l,int h){
    int area=(l*h)/2;
    System.out.println(area);
}
public void type(String type){
    System.out.println(type);
}
}
public class Inheritance {
   public static void main(String[] args) {
    
   Shape s1=new Shape();
   Triangle t1=new Triangle();
    t1.area(2,4);
    t1.type("triangle");
}
}