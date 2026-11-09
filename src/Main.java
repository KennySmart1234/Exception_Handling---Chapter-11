import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        try {
            Scanner inputCollector = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = inputCollector.nextInt();
            System.out.println("You are " + age + " years old.");

        }catch (InputMismatchException e){
            System.out.println("You need to enter an integer");
        }



//        try {
//            int result = 10 / 0;
//            System.out.println(result);
//        }catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
////        System.out.print("Invalid Input");
//
    }
}