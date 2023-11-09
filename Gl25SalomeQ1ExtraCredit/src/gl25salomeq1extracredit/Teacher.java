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

public class Teacher {
    private String name;
    private String subject;
    ArrayList<Section> sections = new ArrayList<>();    

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }
    
    public void addSections(Section s) {
        sections.add(s);
    }
  
    public void giveAssignment(Assignment a) {
        for (Section sect: sections){
            sect.addassign(a);
        }
    }  
}