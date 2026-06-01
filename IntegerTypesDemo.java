class IntegerTypesDemo
{
    public static void main(String args[])
    {
    byte byteVar = 111;
    System.out.println("BYTE VALUE: " + byteVar);
    short shortVar = 31212;
    System.out.println("SHORT VALUE: "+shortVar);
    int intVar = 1_000_222;
    System.out.println("INT VALUE: "+intVar);
    long longVar = 9_222_111_333l;
    System.out.println("LONG VALUE: "+longVar);
    float floatVar = 3.14F;
    System.out.println("FLOAT VALUE: "+floatVar);
    double doubleVar = 3.1415926535;
    System.out.println("DOUBLE VALUE: "+doubleVar);
    char charVar1 = 'C';
    char charVar2 = 68;
    charVar2++; //charVar2+1
    System.out.println("CHAR VALUE 1: "+charVar1);
    System.out.println("CHAR VALUE 2: "+charVar2);
    boolean boolVar=true;
    if(boolVar)
    {
    System.out.println("BOOLEAN VALUE : "+boolVar);
    System.out.println(4>5);
    }
    }
}
