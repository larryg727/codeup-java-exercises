package Java2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by larryg on 5/22/17.
 */
public class GradesApplication {
    public static void main(String[] args) {

        Map<String, Student> students = new HashMap<>();

        Student student1 = new Student("Mike", new ArrayList<>());
        student1.addGrade(90);
        student1.addGrade(89);
        student1.addGrade(74);

        Student student2 = new Student("Sharon", new ArrayList<>());
        student2.addGrade(85);
        student2.addGrade(95);
        student2.addGrade(91);

        Student student3 = new Student("Chester", new ArrayList<>());
        student3.addGrade(92);
        student3.addGrade(83);
        student3.addGrade(79);


        students.put("WithAllYouMike", student1);
        students.put("AlwaysSharon", student2);
        students.put("dntPstrTheChstr", student3);

        System.out.println(students.get(student1));

        Input userinput = new Input();
        System.out.print("Welcome!\n\nHere are the github usernames of our students:\n\n");
        boolean another = true;
        do {
            for (Object username : students.keySet()) {
                System.out.print(" |" + username + "| ");
            }
            System.out.print("\n\nWhat student would you like to see more information on?\n");
            String studentSelected = userinput.getString();
            if (studentSelected.equalsIgnoreCase("WithAllYouMike")) {
                displayStudent(student1, "WithAllYouMike");
            } else if (studentSelected.equalsIgnoreCase("AlwaysSharon")) {
                displayStudent(student2, "AlwaysSharon");
            } else if (studentSelected.equalsIgnoreCase("dntPstrTheChstr")) {
                displayStudent(student3, "dntPstrTheChstr");
            } else {
                System.out.println("Sorry, no student found with the gihub username of " + studentSelected);
            }
           another = userinput.yesNo("\nWould you like to see another student? y/n");
            userinput.getString();
        }while(another);

        System.out.println("Goodbye, and have a wonderful day!");





    }

    public static void displayStudent(Student student, String username){
        System.out.print("\nName: " + student.getName() + " - Github Username: " +
                username + "\nCurrent Average: " +  String.format("%.2f", student.getGradeAverage()) +
        "\nGrades: " + student.getGrades());

    }
}
