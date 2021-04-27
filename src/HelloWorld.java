import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //int myFavoriteNumber = 7;
        //String myString = "Felecia";
        //double myNumber= 3.14;
        System.out.println("HelloWorld");
//       // System.out.println(myString);
        //System.out.println(myNumber);
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        //int x = 4;
        //x = x + 5;
        //x += 5;

//        int x = 3;
//        int y = 4;
//        //y = y * x;
//        y *= x;

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

//        x/=y;
//        y-=x;

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f\n", pi);

        Scanner practice = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        int intNum = practice.nextInt();
        System.out.printf("Thank you for entering the number %d\n", intNum);

        System.out.println("Please enter three words.");
        String firstWord = practice.next();
        String secondWord = practice.next();
        String thirdWord = practice.next();

        System.out.printf("These are your three words, %s\n %s\n %s\n", firstWord, secondWord, thirdWord);

        System.out.println("Please enter a sentence\n.");
        String sentence = practice.nextLine();

        System.out.printf("Your sentence is %s",sentence);


    }

}
