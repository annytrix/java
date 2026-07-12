public class demo {
    public static void main(String[] args) {
        
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner(outer);
        
        inner.fun(outer);
    }
}

// Static nested  class
class Outer {
     private static int x = 4;
    int y;
    static class Inner  {

        Outer outer;
        private String name;
        private static int number;


        Inner(Outer outer){
            this.outer = outer;
        }
        void fun(Outer outer) {
            System.out.println(x);
             System.out.println(outer.y); // This would cause a compilation error
        }
        static void fun2() {
            
        }
    }
}
class BankAccount{

     private static class InterestCalculator{

        static double calculateYearly(double principle, double rate ) {
            return principle * rate;
        }
    }

    public double computeInterest(double principle) {
        return InterestCalculator.calculateYearly(principle, 0.09);
    }  
 }
 
// Uses cases of staic nested classes :
/*
1.As helper class for any outer class
2. Builder Design Pattern
3. if you want to have static methods inside a nested class
4. Request /response DTO


 */