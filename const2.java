

public class const2 {
    public static void main (String[] args){
        Student s1 = new Student("Anny", 28, 102, "IIT");
        
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNums);
        System.out.println(s1.collegeName);

        //Student s2 = new Student();
    }
}
    class Student{
       
    String name;
    int age;
    int rollNums;
    String collegeName;

     //defalt connstracter
     Student(){

     }
     Student(String n, int a, int rn, String c) {       
         name = n;        
         age = a;       
        rollNums = rn;        
        collegeName = c;    
    }    
     
    void markAttendence(){// Behaviour--> instance methods

        System.out.println("Attendence marked for Student"+ name);
        }
    }
    
        
    


