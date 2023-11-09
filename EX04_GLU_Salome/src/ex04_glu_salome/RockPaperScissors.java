package ex04_glu_salome;

/**
 * @author Charles Patrick Salome
 */

import java.util.Scanner;

public class RockPaperScissors{
	public static void main(String[] args){
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2;
                
                Scanner sc = new Scanner(System.in);
		
                //==================
                
                System.out.println("Welcome to Rock, Paper, Scissors! Please choose an option.\n1. Start Game\n2. Select Amount Of Rounds\n3. Exit Game.");
                
                String input = sc.nextLine();
                int in = Integer.parseInt(input);
                
                switch(in) {
                    default:
                        break;
                    case 1:
                        System.out.println("Game Started.");
                        playGame(roundsToWin, rock, paper, scissors);
                        break;
                    case 2:
                        System.out.println("Please enter amount of rounds to play: ");
                        input = sc.nextLine();
                        in = Integer.parseInt(input);
                        playGame(in, rock, paper, scissors);
                        break;
                }
	}
        
        public static void playGame(int rtw, Move rock, Move paper, Move scissors) {            
            boolean ended = false;
            int playerRounds = 0;
            int compRounds = 0;
            Move playerMove = new Move("empty");
            Move compMove = new Move("empty");
            
            Scanner sc = new Scanner(System.in);
            
            while(ended == false) {
                int random = (int) Math.floor(Math.random()*3) + 1;
                
                switch(random) {
                    case 1:
                        compMove = rock;
                        break;
                    case 2:
                        compMove = paper;
                        break;
                    case 3:
                        compMove = scissors;
                        break;
                }
                
                System.out.println("\n1.Rock\n2.Paper\n3.Scissors\nPlease enter your move: ");
                
                String input = sc.nextLine();
                int in = Integer.parseInt(input);
                
                switch(in) {
                    case 1:
                        playerMove = rock;
                        break;
                    case 2:
                        playerMove = paper;
                        break;
                    case 3:
                        playerMove = scissors;
                        break;
                }
                
                switch(rock.compareMoves(playerMove, compMove)) {
                    case 0:
                        playerRounds++;
                        System.out.println("\nPlayer wins the round!");
                        break;
                    case 1:
                        compRounds++;
                        System.out.println("\nComputer wins the round!");
                        break;
                    case 2:
                        System.out.println("\nIt's a tie!");
                        break;
                }
                
                if(playerRounds == rtw) {
                    System.out.println("\n\nPlayer Wins!");
                    ended = true;
                } else if(compRounds == rtw) {
                    System.out.println("\n\nComputer Wins!");
                    ended = true;
                }
            }
        }
}