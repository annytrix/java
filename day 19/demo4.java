// Anonymous class

public class demo4{
    public static void main(String[] args) {
        // Person p1 = new Person()
        // p1.introduce() 
        // Person p2 = new Guest() ; 
        // p2.introduce();
        Person p2 = new Person(){
            String name = "Anny";
            @Override
            void introduce(){
                greet();
                System.out.println("Hello Guest" + name);
            }
            void greet(){
                System.out.println("Hello");
            }
        };
        p2.introduce();
        //p2.greet(); direct call nhi kr skte hai
     }
}
class Person{
    // jo iske ander nhi hai wo hum direct call nhi kr sakte hai

    void introduce(){
        System.out.println("Hello");
    }
}
// class Guest extends Person{
//     @Override
//     void introduce(){
//         System.out.println("Hello Guest");
//     }
//  constructor nhi bna skte hai anonymous class me
// }
/*
Static  nested classmostly usees
Anonymous class --> lambdas replace ker diya hai
Local class

*/
