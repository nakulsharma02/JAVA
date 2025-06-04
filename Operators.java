public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operators
        int x = 56;
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
        // --x predecrement , ++ preincrement
    }
}
