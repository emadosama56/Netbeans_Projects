package uml_to_class;


public class Student {
    private int Id;
    private Subjects[] Courses;
    
    public int getID(){
        return Id;
    }
    public void setID(int Id){
       this.Id = Id;
    }
    
    public Subjects[] getCourses(){
        return Courses;
    }
    
//    public void setCourses(int course_index ,String course_name ,int course_grade){
//        Courses[course_index].setName(course_name);
//        Courses[course_index].setGrade(course_grade);
//    }
    
    
    public int TotalGrade(){
        return Courses[0].getGrade();    //error
    }
}
