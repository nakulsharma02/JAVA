public class Datatypes {
/*  ===== Primitive Data Types =====
byte      // 1 byte, range: -128 to 127
short     // 2 bytes, range: -32,768 to 32,767
int       // 4 bytes, range: -2^31 to 2^31-1
long      // 8 bytes, range: -2^63 to 2^63-1 (use 'L' suffix for literals)
float     // 4 bytes, single-precision 32-bit IEEE 754 (use 'f' suffix)
double    // 8 bytes, double-precision 64-bit IEEE 754
char      // 2 bytes, single 16-bit Unicode character (e.g., 'A', '1', '$')
boolean   // 1 bit, values: true or false
===== Non-Primitive (Reference/Object) Data Types =====
String        // Sequence of characters (e.g., "Hello")
Arrays        // Container for multiple values of same type (e.g., int[], String[])
Classes       // Custom types defined by user using 'class'
Interfaces    // Contract of methods to implement using 'interface'
Enums         // Fixed set of constants using 'enum'
 ===== Special Types =====
null          // Special literal indicating no object reference
var           // Java 10+, type is inferred at compile time (local variables only)
===== Wrapper Classes (for primitive types) =====
Byte, Short, Integer, Long, Float, Double, Character, Boolean
These provide methods and can be used in collections (e.g., ArrayList<Integer>)
*/
//for Example
public static void main(String[] args){
 int a = 23;
 System.out.print(a);
}
}
