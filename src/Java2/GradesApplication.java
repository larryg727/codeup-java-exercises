package Java2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by larryg on 5/22/17.
 */
public class GradesApplication {
    public static void main(String[] args) {

        Map students = new HashMap();

        Student student1 = new Student("Mike", new ArrayList<>());
        student1.addGrade(90);
        student1.addGrade(89);
        student1.addGrade(74);

        Student student2 = new Student("Sharon", new ArrayList<>());
        student1.addGrade(85);
        student1.addGrade(95);
        student1.addGrade(91);

        Student student3 = new Student("Chester", new ArrayList<>());
        student1.addGrade(92);
        student1.addGrade(83);
        student1.addGrade(79);

        students.put("WithAllYouMike", student1);
        students.put("AlwaysSharon", student2);
        students.put("dntPstrTheChstr", student3);

    }
}
