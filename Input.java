//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) throws NumberFormatException, IOException{
        System.out.println("Enter the number");
       // int num = System.in.read();
       //System.out.println(num - 48);

       /*InputStreamReader in = new InputStreamReader(System.in);
       BufferedReader bf = new BufferedReader(in);
       int num = Integer.parseInt(bf.readLine());
       System.out.println(num);
       bf.close();*/

       java.util.Scanner sc = new java.util.Scanner(System.in);
       int num = sc.nextInt();
       System.out.println(num);
    }
}
