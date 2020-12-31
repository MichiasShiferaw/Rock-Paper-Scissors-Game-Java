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
}
