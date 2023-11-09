/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02_glu_salome;

/*
 @author CHARLES PATRICK SALOME
 */
public class Song {
    String title;
    String artist;
    
    //constructor
    public Song(String Titl, String Art) {
        title = Titl;
        artist = Art;
    }
    //get data
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
}
