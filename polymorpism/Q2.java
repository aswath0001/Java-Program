class Employee{
   void work(){
    System.out.println("Employee works");
   }
}
class Developer extends Employee {
    void work(){
        System.out.println("Developer develops");
    }
}
class Tester extends Employee {
    void work(){
        System.out.println("Tester tests");
    }
}


class Q2 {
    public static void main(String[] args) {
        Employee  e;
        e=new Developer();
        e.work();
        e=new Tester();
        e.work();
    }
}