class Student {
   String name;
   int rollNo;
   int marks;
   
   String result (int marks){
      if(marks>=40){
      return "pass";
      }else {
        return "fail";
      }
   }
}
class Q3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "aswath";
        s1.marks=45;
        s1.rollNo=05;
       System.out.println( s1.result(s1.marks));
    }
}