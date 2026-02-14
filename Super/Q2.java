class Person{

    public Person(String name) {
        System.out.println("the name is "+name);
    }   
}
class Student extends Person{
    
    public Student(String name,int age) {
        super(name);
        System.out.println("the age is "+age);
    } 
}
class Q2 {
    public static void main(String[] args) {
       Student s1 = new Student("aswath", 23);

        
    }
}