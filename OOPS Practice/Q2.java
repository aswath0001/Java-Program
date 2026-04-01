class Student {
    private int rollNumber;
    private String name;
    private int age;
    private char grade;

    public Student(int rollNumber,String name,int age,char grade){
        this.rollNumber=rollNumber;
        this.name=name;
        setAge(age);
        setGrade(grade);
    }

    public int getRollNumber(){
    return rollNumber;
    }

    public String getName(){
        return name;
    }

     public void setName(String name) {
        // Validation: name cannot be empty or null
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name! Name cannot be empty.");
        } else {
            this.name = name;
        }
    }

    public int getAge(){
     return age;
    }

    public void setAge(int age){
        if(age>=5 && age<=25){
            this.age=age;
        }else{
            System.out.println("Invalid age");
        }
    }

    public char getGrade(){
        return grade;
    }

    public void setGrade(char grade){
        if(grade=='A' ||grade=='B' ||grade=='C' || grade=='D' || grade=='F'){
            this.grade=grade;
        }else{
            System.out.println("Grade must be 'A','B','C','D','F'.");
        }
    }

    public void displayInfo(){
         System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + (isPassing() ? "PASSING" : "FAILING"));
        System.out.println("------------------------");
    }

    public boolean isPassing(){
   return grade=='A'|| grade=='B'||grade=='C'||grade=='D';
}
}



class Q2 {
       public static void main(String[] args) {

        Student s1 = new Student(101, "John", 20, 'A');
        Student s2 = new Student(102, "Sarah", 17, 'C');
        Student s3 = new Student(103, "Mike", 19, 'F');
        
        // Display all students
        System.out.println("=== Student Information ===\n");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        
        // Test validation
        System.out.println("=== Testing Validation ===\n");
       }
}