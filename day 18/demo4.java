public class demo4 {
    public static void main(String[] args) {
        Animal a = new Dog("Bruno");
        a.makesound();
        a.sleep();
    }
    
}
abstract class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    abstract void makesound();
    void sleep(){
        System.out.println("Animal is sleeping");
    
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    @Override
    void makesound(){
        System.out.println("Dog barks");
    }
}

//Abstract classes 
// Abstract classes
//1. Cannot be instantiated directly
//2. Can contain abstract method (method without implementations)
//3. Can also contain normal methods.
//4. Is meant to be extended.

//. Questions:
//1. Can abstract classes have constructors?  --> Yes
//2. Can abstract classes be final ? --> No
//3. Can abstract class have static methods/variables ? --> Yes
//4. Can abstract classes private methods ? --> yes but non abstract
//5. Can abstract classes have final methods ? --> yes but non abstract
//6. Can abstract classes have no abstract method ? --> Yes