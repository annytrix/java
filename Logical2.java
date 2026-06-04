public class Logical2 {
    public static void main(String[] args) {
        //Logical oprators
        int a =5;
        int b = 10;
        int c = 15;

        boolean d = (a < b) && (b < c);//short circuit apply &&--> &not work short circuit
        System.out.println(d);///true
    }
    
}
