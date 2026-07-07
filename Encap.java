

public class Encap {
    public static void main(String[] args) {
      BnakAccount ba = new BnakAccount();
    //   ba.balance = 1000000.00; 
    //   System.out.println(ba.balance); 
    ba.deposite(500);
    ba.withdraw(300);

    System.out.println(ba.getBlance());
    }
}

class BnakAccount{
    private double balance;

    public void deposite(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        //amount <=balance
        balance -= amount;
    }
     //getters/setters
     public double getBlance(){
         return balance;
    }
}
//     class Student{
//    private String name;
//    private int rollnumber;
//    private int age;
//    private String collageString; 
//    Student (String name)


//     Student (String name,int age, String collage){
//     this.name = name;
//     this.age = age;
//     this.rollnumber = rollnumber;
//     this.collage = collage; 
    
//     }
//     //getters/setters
//     public String getname(){
//         return name;
//     }
//     public void setName(String name){
//         this.name = name;
//     }
//     public String getCollage(){
//         return collage;
//     }
//     public void setCollage(String name){
//         //Validations--> collage should be real
//         this.collage = collage;
//     }
// }
