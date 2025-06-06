public class ConditionalSt {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        //int age = sc.nextInt();
        // if, if-else, if-else ladder statement
        /*if (age<=0)
         System.out.println("Enter the Valid age");
        else if(age<18)
         System.out.println("You are not eligile to vote");
        else if(age>18)
         System.out.println("You are eligible to vote");
        else
         System.out.println("You entered a wrong age");*/
        //Switch Statement
        int day = 3;
        /*switch(day){
            case 1: System.out.println("Monday");
                    break;//if we don't use break atatement fall through condition occurs
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
            default : System.out.println("Enter the valid day");
        }*/
    // Updated Switch statement ( In this update we cann't need to use break as well as we can use the switch statement into a variable)
      /* String result;   
       result = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Enter the valid day"; 
        }; 
        System.out.println(result);*/
        // Use Of yield keyword to return something during the execution of the switch statement
        String result = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> {
                System.out.println("Wednesday");
                yield "Hey this is wednesday";
            }
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Saturday or may be Sunday";
        };
        System.out.println(result);
    }
}
