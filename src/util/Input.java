package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);
    public String getString(){
        return this.scanner.nextLine();

    };
     public boolean yesNo() {
         System.out.println("Enter Yes/y or No");
         String userInput = scanner.nextLine();

         if(userInput.equals("Yes") | userInput.equals("Y") | userInput.equals("yes") | userInput.equals("y")){
             System.out.println("Your answer is true");
             return true;
         }else  {
             System.out.println("Your answer is false");
             return false;
         }
     };

     public int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max);
        int num = scanner.nextInt();

        if (num > min && num < max) {
            System.out.println("Yes, your number is between " + min + " and " + max);
            return num;

        } else {
            System.out.println("Your number is not in range.");
            return getInt(min, max);
        }
         }
    public int getInt(){
         return this.scanner.nextInt();
    }


        public double getDouble(double min, double max){
        System.out.println("Enter a number between " + min + " and " + max);
        double num = scanner.nextDouble();

        if (num > min && num < max) {
            System.out.println("Yes, your number is between " + min + " and " + max);
            return num;

        } else {
            System.out.println("Your number is not in range.");
            return getDouble(min, max);
        }
         }
         public double getDouble(){
            return this.scanner.nextDouble();
         }
        }





