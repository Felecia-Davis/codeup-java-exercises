import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(2, 3));
        System.out.println(subtraction(5, 2));
        System.out.println(multiplication(6, 6));
        System.out.println(division(6, 2));
        System.out.println(modulus(1, 2));
        System.out.println(multiply(2, 3));
        //System.out.println(getInteger(1, 10));

    }

    public static int addition(int num1, int num2) {

        int result = num1 + num2;
        return result;
    }

    public static int subtraction(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static long multiplication(long num1, long num2) {
        long result = num1 * num2;
        return result;
    }

    public static double division(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

    public static double modulus(double num1, double num2) {
        double result = num1 % num2;
        return result;
    }

    public static double multiply(double num1, double num2) {
        double result = 0;
        for (int i = 1; i <= num2; i++) {
            result += num1;


        }
        return result;
    }

//    public static int recursionMultiply(int num1, int num2) {
//        System.out.print(num1);
//        int i = 1;
//        do {
//            int result = num1 + num1
//        }
//        while (i < num2);
//        i++
//        return result; }


    public static int getInteger(int min, int max) {
        Scanner practice = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        int num = practice.nextInt();

        if (num > min && num < max) {
            System.out.println("Yes, your number is between " + min + " and " + max);
            return num;

        } else {
            System.out.println("Your number is not in range.");
            return getInteger(min, max);
        }
    }
//Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!).
//    Ex:
//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24

//    public static void factorial() {
//        Scanner numFactorial = new Scanner(System.in);
//
//       System.out.println("Enter an integer between 1 and 10.");
//       long num = numFactorial.nextLong();
//       for(int i = 1; i <= num; i++){
//           for(int j = 1; j <= num; j++){
//               System.out.println(i + "!")
         // }
       //}
//}
    }


