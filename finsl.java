// Static keyword

public class finsl {
    public static void main(String[] args){
        Student s1 = new Student("Anny", 28, 101);
        Student s2 = new Student("singh", 28, 102);

        Student.collage = "iit Delhi";
        System.out.println(s1.name +" ," + s1.age +" ," +s1.rollnumber+" ," + Student.collage);
        System.out.println(s2.name +" ," + s2.age +" ," +s2.rollnumber+" ," + Student.collage);
    }
}
class Student{
    String name;
    int age;
    int rollnumber;
    static String collage;
    static int grade;

    Student (String name, int age, int rollnumber){
        this.name = name;
        this.age = age;
        this.rollnumber = rollnumber;
    }

    //static block;
    static void main() {
        collage = "iit Delhi";
        grade= 8;
    }

    
}