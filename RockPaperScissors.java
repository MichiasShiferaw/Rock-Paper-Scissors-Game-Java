//Scan all primitive data types
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    
    boolean replay = false;
    while (replay == false) {

      Scanner userInput = new Scanner(System.in);
      
      System.out.println("Choose rock(1), paper(2), or scissors(3) to play against the computer.");
      System.out.println("Enter your move: ");
      String userRandNum = userInput.nextLine();
      Random rndVal = new Random();
      int aiRandNum = rndVal.nextInt(3) + 1;
      String rpsString = "";
      if (aiRandNum == 1) {
        rpsString = "rock";
      } else if (aiRandNum == 2) {
        rpsString = "paper";
      } else if  (aiRandNum == 3) {
        rpsString = "scissors";
      }
      
      String userInputString = userRandNum.toLowerCase(); 
      
      if ((userInputString.equals("rock")) || (userInputString.equals("paper")) 
          || (userInputString.equals("scissor")) || (userInputString.equals("scissors"))) {
                //Convert the words of rps to numerical value
        int userPlayer = 0; 
        if (userInputString.equals("rock")) {
          userPlayer = 1; 
        } else if (userInputString.equals("paper")) {
          userPlayer = 2; 
        } else {
          userPlayer = 3; 
        }
        
                
        if (userPlayer == aiRandNum) {
          System.out.println(" You put a " + userInputString + " and the computer put " 
              + rpsString);
          System.out.println("Soo.. You tied");
        } else if (aiRandNum == userPlayer + 1 || aiRandNum == userPlayer - 2) {
          System.out.println("You put a " + userInputString + " and the computer put " + rpsString);
          System.out.println("You lose!");
        } else  {
          System.out.println("You put a " + userInputString + " and the computer put " + rpsString);
          System.out.println("You win!");
        }
      } else {
        System.err.println("Sorry " + userInputString + " is not an option in RPS.");
        System.err.println("Bye Bye!");
        //Close the program as the value inputted is not qualified to continue through the program
        System.exit(0);
      }
        
      //Ask the user if they want to replay
      System.out.println("Play again? \"Yes\" or \"No\"");
      Scanner redo = new Scanner(System.in);

      String redoString = redo.next();
      if (redoString.equals("Yes") || redoString.equals("yes")) {
        replay = replay;
      }
      if (redoString.equals("No") || redoString.equals("no")) {
        replay = !replay;
        System.out.println("Bye Bye!");
      }
    }
  }
}
