/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gl25salomeq1extracredit;

/**
 *
 * @author Charles Patrick Salome
 */
import java.util.ArrayList;

public class Section {
    private String sectname;
    ArrayList<Student> students = new ArrayList<>();

    public String getSectname() {
        return sectname;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setSectname(String sectname) {
        this.sectname = sectname;
    }

    public void addStudents(Student studentx) {
        students.add(studentx);
    }
    
    public void addassign(Assignment a) {
        for (Student s: students){
            s.addAssignments(a);           
        }
    }
}
