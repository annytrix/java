public class operatoers {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = b / a;
        int g = b % a; 
        System.out.println(c + " ," + d+" ," + e +" ,"+ f + ","+g);

        int h = a + 2;
        // h = h + 2; Since this is okey in CSE
         h += 2;// h=9
         h -= 2;// h=7 
         h *= 3;
         h /= 5;
         h %= 5;
         System.err.println(h);

         int i =6;
         i++; //i + 1 --> i += 1;
         i--;
         System.err.println(i);
         // pre increment and decriment and post increment/decrement
         int j =7;
         j++;// postfix increment
         ++j;// prefix incremrnt
         
         int k = j++;// k = j; j = j+1
        System.out.println(j+ ","+ k);// 10,9
         int l = ++j;
          System.out.println(j +","+l);//11,9



    }
}
