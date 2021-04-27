import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
//    int i = 5;
//        System.out.print("i is ");
//    while (i <= 15) {
//        //System.out.print(" ");
//        System.out.print(i + " ");
//        i++;
//    }
//        System.out.println(" ");
//        int count = 0;
//        do {
//            System.out.println(count);
//            count= count + 2;
//        } while (count <= 100);
//
//        System.out.println(" ");
//        int num = 100;
//        do {
//            System.out.println(num);
//            num = num - 5;
//        } while (num >= -10);
//
//        System.out.println(" ");
//        long num = 2;
//        do {
//            System.out.println(num);
//            num = num * num;
//        } while (num < 1000000);
//
//            System.out.print(" i is ");
//        for(int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }
//
//        System.out.print(" ");
//        for(int i = 100; i >= -10; i= i - 5) {
//            System.out.println(i + " ");
//        }
//
//        System.out.print(" ");
//        for(long i = 2; i < 1000000; i= i * i) {
//            System.out.println(i + " ");
//        }
//
////        Write a program that prints the numbers from 1 to 100.
////        For multiples of three: print “Fizz” instead of the number.
////        For the multiples of five: print “Buzz”.
////        For numbers which are multiples of both three and five: print “FizzBuzz”.
//
//        for(int i = 1; i <= 100; i++) {
//            if((i % 3 == 0)  && (i % 5 == 0)) {
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//            System.out.println("Fizz");
//        }else if( i % 5 == 0){
//                System.out.println("Buzz");
//            }else { System.out.println(i);
//                }
//            }
//
        Scanner newTable = new Scanner(System.in);
        boolean yes;
        do {
            System.out.println("What number would you like to go up to?");
            int theNum = newTable.nextInt();
            System.out.println("Here is your table!");
            System.out.println("number  |  squared   |  cubed");
            System.out.println("------  |  -------   |  -----");
            for (int i = 1; i <= theNum; i++) {
                System.out.println(i + "       |" + i * i + "           | " + i * i * i);

            }
            System.out.print("Continue[y/N]\n");
            String answer = newTable.next();
            yes = answer.equalsIgnoreCase("y");
        }while(yes);
//        System.out.println("Please enter a number between 0 and 100");
//        int numGrades = newTable.nextInt();
//        if((numGrades <= 100) && (numGrades >= 99 )){
//            String gradePlus = "A+";
//            System.out.println(gradePlus);
//        }else if((numGrades <= 98) && (numGrades >= 88 )) {
//            char grade = 'A';
//            System.out.println(grade);
//        }else if((numGrades <= 87) && (numGrades >= 86 )){
//            String gradePlus = "B+";
//            System.out.println(gradePlus);
//        }else if((numGrades <= 85) && (numGrades >= 80 )) {
//            char grade = 'B';
//            System.out.println(grade);
//        }else if((numGrades <= 79) && (numGrades >= 78 )){
//            String gradePlus = "C+";
//            System.out.println(gradePlus);
//        }else if((numGrades <= 77) && (numGrades >= 67 )) {
//            char grade = 'C';
//            System.out.println(grade);
//        }else if((numGrades <= 66) && (numGrades >= 65 )){
//            String gradePlus = "D+";
//            System.out.println(gradePlus);
//        }else if((numGrades <= 64) && (numGrades >= 60 )) {
//            char grade = 'D';
//            System.out.println(grade);
//        }else if((numGrades <= 59) && (numGrades >= 0 )) {
//            char grade = 'F';
//            System.out.println(grade);
//        }
    }
}
