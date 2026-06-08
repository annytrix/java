public class const1 {
    public static void main(String[] args){
    Student s1 =new Student();
    s1.name = "anny";
    s1.age =28;
    s1.rollNums =24021;
    s1.collageName = "abc";
    
    //Constuctors -->To create onjects

    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.rollNums);
    System.out.println(s1.collageName);
        // int x; // local variable --> NO default values
        //System.out.println(x);

    }
}
 
        


/*
Integer --> 0
floating --> 0.0
Boolean --> false
String --> null (nothing)

*/
class Student{// information/data/charctristics--> instance variables
    String name;
    int age;
     int rollNums;
     String collageName;
     
     void markAttendence(){// Behaviour--> instance methods

        System.out.println("Attendence marked for Student"+ name);

     }
}
