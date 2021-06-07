
package uml_to_class;

import java.sql.Time;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
//        Instructor ahmed = new Instructor();
//        Time time = Time.valueOf(LocalTime.now());
//        ahmed.setOfficeHours(time);
//        ahmed.DisplayInfo();


    Subjects subject1 = new Subjects();
    subject1.setName("math");
    subject1.setGrade(100);
    Subjects subject2 = new Subjects();
    subject2.setName("english");
    subject2.setGrade(200);
    
    Student student = new Student();
    student.setID(1);
    Subjects[] x = student.getCourses();
    System.out.println(x);
//    Institute institute = new Institute();
//    institute.setName("ITI");
//    System.out.println(institute.getStudent());
    }
    
}
