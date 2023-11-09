package ex01_glu_salome;

/**
 *
 * @author Charles Patrick Salome
 */
public class ex01_glu_salome {
  public static void main(String[] args) {
    
    //student 1
    String name1 = "Ck Salome";
    int age1 = 16;
    String favsubj1 = "Math";

    //student 2
    String name2 = "Kate Quebral";
    int age2 = 16;
    String favsubj2 = "Adtech";

    //student 3
    String name3 = "Aaron Bomediano";
    int age3 = 16;
    String favsubj3 = "Study Period";

    //for operations
    int totalage = age1 + age2 + age3;
    int age1age2diff;
    
    //output student 1
    System.out.println("Student 1");
    System.out.println("Name: " + name1);
    System.out.println("Age: " + age1);
    System.out.println("Favorite Subject: " + favsubj1);
    
    //output student 2
    System.out.println("\nStudent 2");
    System.out.println("Name: " + name2);
    System.out.println("Age: " + age2);
    System.out.println("Favorite Subject: " + favsubj2);
    
    //output student 3
    System.out.println("\nStudent 3");
    System.out.println("Name: " + name3);
    System.out.println("Age: " + age3);
    System.out.println("Favorite Subject: " + favsubj3);

    //operation 1
    System.out.println("\n\nStudents: " + name1 + ", " + name2 + ", " + name3);
    
    //operation 2
    System.out.println("Total age of the 3 students: " + totalage);

    //operation3
    if (age1 > age2){
      age1age2diff = age1 - age2;
    } else {
      age1age2diff = age2 - age1;
    }
    System.out.println("Age difference between " + name1 + " and " + name2 + ": " + age1age2diff);
    
  }
}