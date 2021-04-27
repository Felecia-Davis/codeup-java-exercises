public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(2, 3));
        System.out.println(subtraction(5, 2));
        System.out.println(multiplication(6, 6));
        System.out.println(division(6, 2));
        System.out.println(modulus(1, 2));
        System.out.println(multiply(2, 3));

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


            //System.out.println(result);
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
//        return result;
//    }
}