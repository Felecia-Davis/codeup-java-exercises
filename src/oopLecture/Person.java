package oopLecture;

public class Person {
    public String firstName;
    public String lastName;

    public static void main(String[] args){
        Person ken = new Person();
        System.out.println(ken);

        ken.firstName = "Ken";
        ken.lastName = "Howell";

        System.out.println("ken.firstName = " + ken.firstName);
        System.out.println("ken.lastName =" + ken.lastName);


    }
}
