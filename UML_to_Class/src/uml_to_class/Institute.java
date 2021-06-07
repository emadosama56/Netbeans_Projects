
package uml_to_class;

/**
 *
 * @author Emad Osama
 */
public class Institute {
    private String Name;
    private Student[] student;
    private Instructor[] instructor;
    private Adminstrator[] adminstrator;
    
    
    public String getName(){
        return Name;
    }
    public void setName(String Name){
       this.Name = Name;
    }
    
    public Student[] getStudent(){
        return student;
    }
    public Instructor[] getInstructor(){
        return instructor;
    }
    public Adminstrator[] getAdminstrator(){
        return adminstrator;
    }
}
