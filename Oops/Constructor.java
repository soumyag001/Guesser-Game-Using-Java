class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name+" "+this.age);
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
}
public class Constructor{
    public static void main(String[] args) {
        Student s1=new Student("Soumya",21);
        Student s2=new Student(s1);
        s1.printinfo();
        s2.printinfo();
    }
}