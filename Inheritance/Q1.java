class Person{
String name;
int age;
}
class Student extends Person {
    int mark;
}
class Q1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aswath";
        s1.age = 23;
        s1.mark = 78;

        System.out.println(s1.age);
         System.out.println(s1.name);
          System.out.println(s1.mark);
    }
}