package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);
    public String getString(){
        return this.scanner.nextLine();

    };
     public boolean yesNo() {
         if(scanner.nextLine().equals("Yes") || scanner.nextLine().equals("yes")){
             return true;
         }else {
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
         };
        }





