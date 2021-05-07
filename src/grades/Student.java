package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public void setName(String name){
         this.name = name;
    }
    Student (String name){ //Student constructor is needed.
        this.name = name;
        this.grades =  new ArrayList<>();

    }

    // returns the student's name
    public String getName() {//getName needed to get name out of private.
        return name;
    }
//        public ArrayList<Integer> shareGrade(){
//            return this.grades;
//        }


    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        double average = 0;
        for(int agrade: grades){
             average = average + agrade;

        }

        return average/this.grades.size();
    }
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();

        Student mark = new Student("Mark");
        mark.addGrade(78);
        mark.addGrade(98);
        mark.addGrade(89);
        System.out.println(mark.getName());
        System.out.println( mark.getGradeAverage());


    }
}
