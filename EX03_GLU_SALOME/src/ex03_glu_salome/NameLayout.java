/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03_glu_salome;

/*
 @author CHARLES PATRICK SALOME
 */
public class NameLayout {
    int age;
    String birthday;
    String quote;
    
    //construct layout
    public NameLayout(int a, String bday, String qte) {
        age = a;
        birthday = bday;
        quote = qte;
    }
    //get data
    public int getAge() {
        return age;
    }
    public String getBirthday() {
        return birthday;
    }
    public String getQuote() {
        return quote;
    }
}


