public class sw {
    public static void main(String[] args) {
        //Switch statement
     int i = 3;

     switch (i) {// switch(expression) byte,short,int, char, Enumeration
       case 1:
       System.out.println("i is 1");
       break; 
       case 2:
       System.out.println("i is 2"); 
       break;
       case 3:
       System.out.println("i is 3");
       break; 
       default:
       System.out.println("i is  greater then 3");
       break; 
     }
     //switch --> limited use case should evaluate to byte ,short ,int ,char,enumeration
     //no duplicate case allow
     //after JDK7 String can also be used as switch expression
     // After JDK14 switch enhenced too much
    //   if(i == 1){
    //         System.out.println("i is 1");
    //     }
    //     else if (i == 1) {
    //         System.out.println("i is 2");
    //     }
    //     else if (i == 2) {
    //         System.out.println("i is 3");
    //     }
    //     else if (i == 3) {
    //         System.out.println("i is 4");
    //     }
    //     else {
    //         System.out.println("i is greater then 3");
    //     }
    int j = 5;
    int k = 1;
    switch (j){
        case 4:
        System.out.println("j is 4");
        break;
        case 5:
        switch(k){
            case 1:
            break;
            case 2:
            break;
        }
        System.out.println("j is 5");
        break;
        default:
        System.out.println("j is 6");
        break;
    }

    }
    //Selection statements
}
