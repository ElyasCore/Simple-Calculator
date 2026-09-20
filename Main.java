import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = in.nextDouble();
        System.out.print("Enter Second number: ");
        double b = in.nextDouble();
        char op;
        while(true) {
            System.out.print("Enter the Operation: ");
            op = in.next().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                break;
            } else{
                System.out.println("Operation is incorrect, please try again.");
            }
        }
        switch (op) {
            case '+':
                System.out.println("a+b = " + (a+b));
                break;
            case '-':
                System.out.println("a-b = " + (a-b));
                break;
            case '*':
                System.out.println("axb = " + (a*b));
                break;
            case '/':
                if(b == 0) {
                    while(true) {
                        System.out.print("invalid number, Enter Second number again: ");
                        b = in.nextDouble();
                        if(b != 0){
                            break;
                        }
                    }
                }
                System.out.println("a/b = " + (a/b));
                break;
        }
    }
}