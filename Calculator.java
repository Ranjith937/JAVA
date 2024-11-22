import java.util.Scanner;  //program in do-while for rotate
public class Calculator {
    public static void main(String[] args){
        System.out.println("Welcome to the Calculator app");
        Scanner Hi = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        double a = Hi.nextDouble();
        System.out.println("Enter the value of b : ");
        double b = Hi.nextDouble();
        System.out.println("Which Operation would you like to do?a)a+b b)a-b c)a*b d)a/b e)a%b");
        String ans1 = Hi.next();
        if(ans1.equals("a")) {            // For String , we use .equals instead of ==
           System.out.println("The answer is : "+(a+b));
        }
        else if(ans1.equals("b")){
            System.out.println("The answer is : "+(a-b));
        }
        else if(ans1.equals("c")){
            System.out.println("The answer is : "+(a*b));
        }
        else if(ans1.equals("d")){
            System.out.println("The answer is : "+(a/b));
        }
        else if(ans1.equals("e")){
            System.out.println("The answer is : "+(a%b));
        }
    }
}
