/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gl25salomeq1extracredit;

/**
 *
 * @author Charles Patrick Salome
 */
public class Assignment {
    private String name;
    private double timeAllotted;

    public Assignment(String name, double timeAllotted){
        this.name = name;
        this.timeAllotted = timeAllotted;
    }

    public String getName() {
        return name;
    }

    public double getTimeAllotted() {
        return timeAllotted;
    }
   
    public void setName(String name) {
        this.name = name;
    }

    public void setTimeAllotted(double timeAllotted) {
        this.timeAllotted = timeAllotted;
    }
    
    
}
