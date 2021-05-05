import util.Input;

import java.util.Scanner;

public class Bob {


    public static void  convoWithBob(){
        boolean talk;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bob is ready to talk.");
            do {
            System.out.println("Talk to Bob.");
            String talkWithBob = scanner.nextLine();

            if (talkWithBob.endsWith("?")) {
                System.out.println("Sure.");
            } else if (talkWithBob.endsWith("!")) {
                System.out.println("Whoa! chill out!");

            } else if (talkWithBob.equals("")) {
                System.out.println("Fine.  Be that way.");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Would you like to continue talking to Bob?[yes/no]");
                    String contBobTalk = scanner.nextLine();
                        if(contBobTalk.equalsIgnoreCase("yes")){
                            talk = true;
                        }else {
                            talk = false;
                        }
            }while (talk);
    }
        public static void main(String[] args){
            convoWithBob();

    }
}
