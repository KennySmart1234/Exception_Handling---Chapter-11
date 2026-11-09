import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        try {

            Scanner inputCollector = new Scanner(System.in);

            int age = inputCollector.nextInt();
            if (age < 0) {
                throw new InputMismatchException("Age cannot be negative");
            }
                System.out.print(age + " is a valid age");
        }catch (InputMismatchException e){
            System.out.println("uuu");
        }

//        try {
//            System.out.println("a");
//            int result = 10 / 0;
//            System.out.print("b");
//
//            System.out.println(result);
//        }catch (InputMismatchException  e){
//            System.out.println("You need to enter a number 1");
//        } catch (ArithmeticException e){
//            System.out.println("You need to enter an integer 2");
//        }


//        try {
//            System.out.print("Enter a numerator: ");
//            int numerator = inputCollector.nextInt();
//            System.out.print("Enter a denominator: ");
//            int denominator = inputCollector.nextInt();
//
//            int result = numerator / denominator;
//
//            System.out.println(result);
//
//        }
//
//        catch (InputMismatchException e){
//            System.err.println(e);
//        }catch (ArithmeticException e){
//            System.err.println(e);
//        }

    }


}
