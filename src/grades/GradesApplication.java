package grades;
import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
 public static void main(String[] args) {

  HashMap<String, Student> students = new HashMap<>();
  Student markGrades = new Student("mark");
  markGrades.addGrade(100);
  markGrades.addGrade(89);
  markGrades.addGrade(87);

  Student johnGrades = new Student("john");
  johnGrades.addGrade(100);
  johnGrades.addGrade(89);
  johnGrades.addGrade(87);

  Student sarahGrades = new Student("sarah");
  sarahGrades.addGrade(100);
  sarahGrades.addGrade(89);
  sarahGrades.addGrade(87);

  Student jamesGrades = new Student("james");
  jamesGrades.addGrade(100);
  jamesGrades.addGrade(89);
  jamesGrades.addGrade(87);

  students.put("mjacks", markGrades);
  students.put("jmichaels", johnGrades);
  students.put("sariel", sarahGrades);
  students.put("jrogers", jamesGrades);


  System.out.println("Welcome");
  System.out.println("Here are the GitHub usernames of our students.");
  for (int i = 0; i < students.size(); i += 1) {
   System.out.println(students.toString());

   // }

  }
 }
}