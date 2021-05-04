import java.util.Scanner;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;

    }

    public String getName() {
//TODO: return the person's name
        return name;
    }

    public void setName(String name) {
        this.name = name;
//TODO: change the name property to the passed value
    }

    public void sayHello() {
        System.out.println("Hello " + name);
//TODO: print a message to the console using the person's name

    }

    public static void main(String[] args) {
        Person ajd = new Person("Michael Jackson");
        System.out.println("This is the person's name: " + ajd.getName());
        ajd.setName("Miriam Anderson");
        System.out.println("This is the person's name: " + ajd.getName());
        ajd.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}