public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operators
        /*int x = 56;
        int y = 20;
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        int sum = x + y;
        int diff = x - y;
        int prod = x*y;
        int div = x/y;
        int rem = x%y;
        System.out.println("Sum: "+ sum);
        System.out.println("Difference: "+ diff);
        System.out.println("Product: "+ prod);
        System.out.println("Quotient: "+ div);
        System.out.println("Remainder: "+ rem);
        x++;//post increment also used as x += 1  or x = x+1
        System.out.println("Value of x after increment: " + x);
        y--;//post decrement
        System.out.println("Value of y after decrement: " + y);
        // --x predecrement , ++ preincrement type - unary */
        
        // Assignment Operators : =, +=, -=, *=, /=
        /*int x = 5;
        x+=5;
        System.out.println(x);*/
        
        //Relational Operators : <, >, <=, >=, ==
        /*int a = 78;
        int b = 89;
        boolean c = a<b;  // true
        boolean d = a>b;  // false
        boolean e = a<=b; // true
        boolean f = a>=b; // false
        boolean g = a==b; // false
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("a<b: " + c);
        System.out.println("a>b: " + d);
        System.out.println("a<=b: " + e);
        System.out.println("a>=b: " + f);
        System.out.println("a==b: " + g);*/

        // Logical Operators : logical &, logical |(no short circuiting), !, &&, ||, and some bitwise Operators like bitwise & and | 
        /*int x = 78;
        int y = 98;
        boolean a = true;
        boolean b = false;
        byte c = 0b10010;
        byte d = 0b101010;
        System.out.println(x>y||x==y);// false
        System.out.println(x<y|x==y);// true
        System.out.println(a|b);// true
        System.out.println(a&b);// false
        System.out.println(!b);// true
        System.out.println(c&d);// 2
        System.out.println(c|d);// 58 */

        // Ternary Operators (condition?statement1:statement2)
        int age = 20;
        String result = (age>18)?"You are Elidgible":"You are not eligible";
        System.out.println(result);
    }
}