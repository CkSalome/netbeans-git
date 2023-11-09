/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03_glu_salome;

/*
 @author CHARLES PATRICK SALOME
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    static int totalPerformances = 0;
    
    //constructor for Singer
    public Singer(String SingerName) {
        this.name = SingerName;
        noOfPerformances = 0;
        earnings = 0.0;
    }
    
    
    public void changeFavSong(Song FavSong) {
        this.favoriteSong = FavSong;
    }
    
    //get earnings and noofperformances
    public void performForAudience(int NoOfAudience) {
        noOfPerformances++;
        earnings = earnings + NoOfAudience * 100;
        totalPerformances++;
        
    }
    //split earnings for each singer
    public void performForAudience(Singer p, int NoOfAudience) {
        double EarningsPerPerson = (NoOfAudience * 100) / 2.0;
        earnings = earnings + EarningsPerPerson;
        p.earnings = EarningsPerPerson;
    }
   
    
    //get data
    public String getName() {
        return name;
    }
    
    public double getEarnings() {
        return earnings;
    }
    
    public int getNoOfPerformances() {
        return noOfPerformances;
    }
    
    public static int getTotalPerformances() {
        return totalPerformances;
    }
    
    public Song getFavoriteSong() {
        return favoriteSong;
    }
}
