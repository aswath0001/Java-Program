class Employee {
    String name;
    double salary;

     Employee(String A ,int B) {
        name =A;
        salary =B;
    }
void display(){
    System.out.println("Name is "+ name + " and salary is "+salary);
}
    
}

class Q2 {
    public static void main(String[] args) {
      Employee E1 = new Employee("aswath" ,3400000);
      E1.display();
       Employee E2 = new Employee("Abi" ,340000);
      E2.display();
    }
}