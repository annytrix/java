public class Demo4 {
    public static void main(String[] args) {
        A a = new B();
        //a.fun();
        System.out.println(a.getX());
    }
}
//static
// class A {
//     static void fun(){
//         System.out.println("hello");
//     }
//     private  void fun2(){
//         System.out.println("hello");
//     }
//     final void fun3(){
//         System.out.println("hello");
//     }
// }
// class B  extends A{
//     static void fun(){
//         System.out.println("bye");
//     }
// }
// final void fun3(){
//         System.out.println("bye");
// }

class A{
    int getX(){
        return 10;
    }
    }



class B extends A {
    int getX() {
        return 20;
    }
}