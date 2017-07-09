package inheritanceDemo;
public class InheritanceDemo {
    public static void main(String[] args) {
        //Person p1=new Student(2550,"Sept 2016","JOHN DOE","Kathmandu","9800","@.xx");
        //Person p2=new Person("JOHN DOE","Kathmandu","9800","@.xx");
        Student s1=new Student(2550,"Sept 2016","JOHN DOE","Kathmandu","9800","@.xx");
        System.out.println(s1.value);
        s1.printProfile();
    }
}
