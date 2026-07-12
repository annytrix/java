// BufferedReader 
import java.io.*;

public class Demo4{
public static void main(String[] args) throws IOException {
    //InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String name = br.readLine(); 
       System.out.println(name);

    }
}
/*
1. Anny 
2.65,121 
3. System.in (InputStrem) recieves bytes
4.InputStreamReader --> stream of bytes to stream of characters
 (A, n, n, y) 
5. BufferedReader -->  readLine--> Anny --> name 
6. Anny --> o/p

*/