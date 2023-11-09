/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gl25salomeq1extracredit;

/**
 *
 * @author Charles Patrick Salome
 */
public class gl25salomeq1extracredit {
    public static void main(String[] args) {
                       
        Assignment a1 = new Assignment("FA1",2);
        Assignment a2 = new Assignment("LA1",3);
        Assignment a3 = new Assignment("SA1",5);
        
        Student s1 = new Student();
        s1.setName("Bob");
        Student s2 = new Student();
        s2.setName("Kate");
        Student s3 = new Student();        
        s3.setName("Aron");

        Section c1 = new Section();
        c1.setSectname("Gluon");
        c1.addStudents(s1);
        c1.addStudents(s2);
        Section c2 = new Section();
        c2.setSectname("Potassium");
        c2.addStudents(s3);
        
        Teacher t1 = new Teacher();
        t1.setName("Joe");
        t1.setSubject("Math");
        t1.addSections(c1);
        t1.addSections(c2);
        
        Teacher t2 = new Teacher();
        t2.setName("Jane");
        t2.setSubject("English");
        t2.addSections(c2);
        
        Teacher t3 = new Teacher();
        t3.setName("Jill");
        t3.setSubject("Science");
        t3.addSections(c1);
        
        t1.giveAssignment(a1);
        t2.giveAssignment(a2);
        t3.giveAssignment(a3);
        s2.finishAssignment(a1);
        System.out.printf("%s remaining work: %.2f%n", s1.getName(), s1.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", s2.getName(), s2.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", s3.getName(), s3.getTimeNeeded());

    }
    
}

