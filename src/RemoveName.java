
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveName {

    public String name;

    public static void main(String[] args) {
        String Contactlist [] = {"Mary Davis 3362547977", "Jonathan Sanchez  2102345765","Timothy Lefkowitz 2105672365" };

        removeName("Jonathan Sanchez", Contactlist);

    }

    //Method to remove  contact with string.
    public static void removeName(String name, String [] strArray) {
        //Scanner cl = new Scanner(System.in);
         //name = cl.nextLine();
        //List<String> list = Arrays.asList(strArray);
        for (int i = 0; i < strArray.length; i++) {

            if (strArray[i].contains(name)) {
                continue;
            } else {
                System.out.println(strArray[i]);
            }
        }
        System.out.print(Arrays.toString(strArray));
    }

    // Method to remove name with Arraylist
//    public static void removeName(String name, String [] strArray) {
//        List<String> list = Arrays.asList(strArray);
//        for (int i = 0; i < list.size(); i++) {
//
//            if (list[i].contains(name)) {
//                list.remove(i);
//            } else {
//                System.out.print(list[i]);
//            }
//
//            System.out.print(list);
//        }
//    }
}


