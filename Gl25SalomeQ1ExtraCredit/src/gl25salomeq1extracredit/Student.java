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

public class Student {
    private String name;
    ArrayList<Assignment> assignments = new ArrayList<>();

    public String getName() {
        return name;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }
    
    public void addAssignments(Assignment assignx) {
        assignments.add(assignx);
    }

    public void finishAssignment(Assignment a) {
        for (Assignment t: assignments){
            if (t.getName().equals(a.getName())) {
                assignments.remove(t);
            }
        }
    }
    
    public double getTimeNeeded(){
        double total = 0;
        
        for (Assignment t: assignments){
            total = total + t.getTimeAllotted();
        }
        
        return total;
    }
}
