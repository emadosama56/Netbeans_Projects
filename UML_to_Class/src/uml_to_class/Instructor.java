
package uml_to_class;

import java.sql.Time;


public class Instructor {
    private Time OfficeHours;
    private Subjects[] Courses;
    
    public Time getOfficeHours(){
        return OfficeHours;
    }
    
    public void setOfficeHours(Time OfficeHours){
        this.OfficeHours = OfficeHours;
    }
    
    public Subjects[] getCourses(){
        return Courses;
    }
    
    public void DisplayInfo(){
        System.out.println(this.OfficeHours);
        System.out.println(this.Courses);
        
    }
}
