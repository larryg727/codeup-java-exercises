package Java2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by larryg on 5/22/17.
 */
public class Student {

    private String name;
    private List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;

    }


    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double average = 0;
    for(Integer grade : grades) {
        average += grade;
    }
    return average / grades.size();

    }

    public String getGrades(){
        String gradesString = "";
        for(Integer grade: grades){
            gradesString += " |" +  grade + "| ";
        }
            return gradesString;
    }


    public static void main(String[] args) {
        Student student1 = new Student("Bob", new ArrayList<>());

        student1.addGrade(99);
        student1.addGrade(89);
        student1.addGrade(94);
        System.out.println(student1.getName() + "'s grade average is " + student1.getGradeAverage());
    }

}
