public class Bitwise {
    public static void main(String[] args) {
        //Bitwise oprations
        int a = 2;//--> 00000000 00000000 00000000  00000010   
        int b = 3;//-->00000000  00000000  00000000  00000011  
        int c = a & b; //10-->2
        int d = a| b ;//11-->3
        int e = a ^ b;//01-->1
        int f = ~ a;//ture,flase 11111111 11111111 11111111 11111101 -->-3
        System.err.println(c + ","+ d + "," + e +"," +f );
        //Shift oprations
        int g = 1;// 00000000 00000000 00000000 00000001 -->
        g = g << 33;// 01000000 00000000 0000000 00000000--> g = g << 33 == g << 1

        //right shift
        byte h = 1;
        h = (byte)(h << 1);


        System.out.println(g);
        System.out.println(h);


    }
    
}
