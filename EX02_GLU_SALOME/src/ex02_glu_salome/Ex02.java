/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02_glu_salome;

/*
 @author CHARLES PATRICK SALOME
 */
public class Ex02 {

    public static void main(String[] args) {
        //providing info for each person (Ex01)
        NameLayout Ck = new NameLayout(17, "September 20, 2006", "Miss Ko Na Siya");
        NameLayout Aaron = new NameLayout(16, "May 27, 2007", "Ride like lightning, Crush like thunder");
        NameLayout Kate = new NameLayout(16, "August 17, 2023", "Miss Ka Ba >:D");
        
        //output person 1
        System.out.println("Ck Salome\nAge: " + Ck.getAge());
        System.out.println("Birthday: " + Ck.getBirthday());
        System.out.println("Quote: " + Ck.getQuote() + "\n");
        
        //output person 2
        System.out.println("Aaron Bomediano\nAge: " + Aaron.getAge());
        System.out.println("Birthday: " + Aaron.getBirthday());
        System.out.println("Quote: " + Aaron.getQuote() + "\n");
        
        //output person 3
        System.out.println("Kate Quebral\nAge: " + Kate.getAge());
        System.out.println("Birthday: " + Kate.getBirthday());
        System.out.println("Quote: " + Kate.getQuote() + "\n");
        
        //providing songs and singers
        Song song1 = new Song("Fallen", "Lola Amour");
        Song song2 = new Song("Funky Town", "Lipps Inc.");
        Song song3 = new Song("Idol", "Yaosobi");
        Song song4 = new Song("Chug Jug With You", "Leviathan");
        
        Singer singer1 = new Singer("Kyle Bome");
        Singer singer2 = new Singer("Ritz Jay");
        
        //Singer.java code values
        singer1.changeFavSong(song1);
        singer2.changeFavSong(song2);
        singer1.performForAudience(18);
        singer2.performForAudience(18);
        
        //NoOfAudience = sum of both singer1 and singer2
        singer1.performForAudience(singer2, 36);
        
        //output for "performance"
        System.out.println("Singer 1 \nName: " + singer1.getName());
        System.out.println("# of Performances: " + singer1.getNoOfPerformances());
        System.out.println("Earnings: P" + singer1.getEarnings());
        System.out.println("Favorite Song: " + singer1.getFavoriteSong().getTitle());
        
        System.out.println("\nSinger 2 \nName: " + singer2.getName());
        System.out.println("# of Performances: " + singer2.getNoOfPerformances());
        System.out.println("Earnings: P" + singer2.getEarnings());
        System.out.println("Favorite Song: " + singer2.getFavoriteSong().getTitle());
        
        
        //change FavSong
        singer1.changeFavSong(song3);
        singer2.changeFavSong(song4);
        
        System.out.println("\n\n" + singer1.getName() + "'s New Favorite Song: " + singer1.getFavoriteSong().getTitle());
        System.out.println(singer1.getName() + "'s New Favorite Song: " + singer2.getFavoriteSong().getTitle());
    }
}  

