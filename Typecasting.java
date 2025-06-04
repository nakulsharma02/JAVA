public class Typecasting {
//Type Conversion and Casting
public static void main(String[] args) {
    int a = 45;
    byte b = 0b0100;
    int c = 67;
    a = b; // Implicit coversion byte to int possible but vice-versa not
    System.out.println(a);
    b = (byte)c;
    System.out.println(b);// Explicit type casting to convert bigger size datatype to smaller.
    float f = 10.89f;// Float value
    int t = (int)f; // Int Value
    System.out.println(f+" : float "+ t + " : int");
    // Type Promotion
    byte n1 = 23;
    byte n2 = 45;
    int result = n1*n2;// Java Automatically converts the byte into int at the time of operation
    System.out.println(result);
}    
}