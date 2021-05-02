import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f\n", pi);

        Scanner practice = new Scanner(System.in);
//        System.out.println("Please enter an integer.");
//        int intNum = practice.nextInt();
//        System.out.printf("Thank you for entering the number %d\n", intNum);
//
//        System.out.println("Please enter three words.");
//        String firstWord = practice.next();
//        String secondWord = practice.next();
//        String thirdWord = practice.next();
//
//        System.out.printf("These are your three words, %s\n %s\n %s\n", firstWord, secondWord, thirdWord);

        System.out.println("Please enter a sentence.");
        String sentence = practice.nextLine();
        System.out.println("Your sentence is:");
        System.out.println(sentence);
    }
}
