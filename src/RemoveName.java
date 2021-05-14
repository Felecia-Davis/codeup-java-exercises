
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveName {

    public String name;

    public static void main(String[] args) {
        String [] contactList = {"Mary Davis 3362547977", "Jonathan Sanchez  2102345765","Timothy Lefkowitz 2105672365"};

        removeName(contactList);

    }

    //Method to remove  contact with string.
//    public static void removeName() {
//        Scanner cl = new Scanner(System.in);
//        String name = cl.nextLine();
//        List<String> strings = Files.readAllLines(ContactsTxtPath);
//        List<String> anotherCL = new ArrayList<>();
//        for (String string : strings) {
//            if (string.equals(name)) {
//
//                continue;
//            } else
//                anotherCL.add(string);
//        }
//        Files.write(ContactTxtPath);
//
//    }
//}

    //Method to remove name with Arraylist
    public static void removeName(String[] strArray) {
        Scanner cl = new Scanner(System.in);
        String name = cl.nextLine();
        List<String> list = Arrays.asList(strArray);
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).contains(name)) {
                list.remove(i);
            } else {
                System.out.print(list.get(i));
            }

            System.out.print(list);
            // original parameter
            // String [] strArray
        }
    }
}

  //Method to remove using a string;
    //String strArray[] = str.split(",");
    //Scanner cl = new Scanner(System.in);
    //String name = cl.nextLine();

    //Another contact list array of size one less
    //String [] anotherCL = new String[strArray.length -1];
    // int k = 0;
    //for (int i = 0; i < strArray.length; i++) {

    //if (strArray[i].contains(name)) {
//                //another contact list array of size one less
//                String [] anotherCL = new String[strArray.length -1];
    //The elements copied to new array with one less.
    //The elements copied to new array with one less.
    //anotherCL[k++] = (strArray[i]);
   // System.out.println("This is the original array");
//        System.out.println(Arrays.toString(strArray));
//        System.out.println("This is another array");
//        System.out.print(Arrays.toString(anotherCL))




