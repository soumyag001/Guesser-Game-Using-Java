class Student{
 String name;
 int age;
 int cgpa;
 public void printinfo(String name){
    System.out.println(name);
 }
 
 public void printinfo(int age){
    System.out.println(age);
 }
 public void printinfo(String name,int age){
    System.out.println(age+" "+name);
 }
 
}
public class Polymorphism {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.printinfo("Soumya",21);
    }
}
