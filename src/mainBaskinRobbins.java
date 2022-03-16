import java.util.InputMismatchException;
import java.util.Scanner;

public class mainBaskinRobbins {
    public static void main(String[] args) {


            /*
            make an objects in the main class that has all the features of this game, BaskinRobbins.
            call a userName and set your userName from user input using Scanner
            then set a max number that you want to reach, then it will send the numbers to the baskinRobbins class, and
            use that number in that class.
            then it will choose who will go first by flipping coins.
                - this uses Math.random() to make random integer from 0 or 1, and if the user has the right answer, then
                they will go first otherwise, computer will generate random number up to 3, and add it to count variable,
                and takes turn each time, by calling each other's method on their loop
                if they put something other than what the program accept, they will catch the bug and give another chance until they
                put right input.
                once the count variable reaches the max value the game will end.
            */


            baskinRobbins b = new baskinRobbins();
            b.UserName();
            System.out.println("Please write the max limit integer you want to reach");
            Scanner intPut = new Scanner(System.in);
            int maxReach = intPut.nextInt();
            baskinRobbins b1 = new baskinRobbins(maxReach);

            b.explainRule();

            if (b1.Turn()==true) {
                b1.runUser();
            } else {
                b1.runComputer();
            }


        }

    }

