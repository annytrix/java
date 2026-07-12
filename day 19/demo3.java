//Local class

public class demo3{
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.greet();
    }
}
// Effrctive final variable 
class Outer{
    //static private int x = 10;
    void greet(){
        int y = 20;
        //y++; nhi kr sakte hai
        //System.out.println("Hello");
        class Local{
            void sayHello(){
                System.out.println(y);
            }
            // void sayHello2(){
            //     System.out.println("Hello2");
            // }
            // void sayHello3(){
            //     System.out.println("Hello3");
            // }
        }
        Local local = new Local();
        local.sayHello();
        // local.sayHello2();
        // local.sayHello3();
    }
}
/* kisi bhi class ko hum local class kehte hai agar wo kisi method ke andar define ho.
Constructor
Meth
If
Loop
Static block 
*/