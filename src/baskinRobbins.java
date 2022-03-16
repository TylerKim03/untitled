import java.util.InputMismatchException;
import java.util.Scanner;

public class baskinRobbins extends User {

    private int maxReach;
    int count = 0;

    Scanner input = new Scanner(System.in);

    public baskinRobbins(int a){
        this.maxReach = a;
    }

    public baskinRobbins() {
        super.artificialPlayer();
    }


    @Override
    public void UserName() {
        System.out.println("Please enter your Username");
        String Username1 = input.next();
        System.out.println("your name is:"+ Username1);
    }

    @Override
    public void NumberOfUser() {
        String[]a = new String[1];
        System.out.print(a.length);
    }

    public boolean Turn(){
        System.out.println("It's time for you to choose the turn");
        System.out.println("I will throw a coin and if you think it's tail then enter t and vice versa/n if you are " +
                "right then you will go first");
        int a = (int)(Math.random()*10%2);
        System.out.println("Heads or Tails");
        String UserInputTurn = input.next();
        if(UserInputTurn.equals("t") && a == 0 || UserInputTurn.equals("h") && a == 1){
            System.out.println("You go First");
            return true;
        } else {
            System.out.println(" you are second!");
            return false;
        }
    }





    public void runComputer(){

        int a = (int)(Math.random()*3)+1;

        for(int i = 1; i<=a; i++){
            count++;
            System.out.println("Computer    " + count);
        }
        if (count >= this.maxReach) {
            System.out.println("Game is Over, you won the game");
        } else {
            runUser();
        }

    }
    public void runUser() {

        Scanner intput;
        System.out.println("Your Turn!");
        int userNumber = 0;
        do {
            try {
                userNumber = 0;
                intput = new Scanner(System.in);
                userNumber = intput.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("invalid value!");
            } finally {
                if (userNumber == 1) {
                    count++;
                    System.out.println("You:        " + count);
                    break;
                } else if (userNumber == 2) {
                    count++;
                    System.out.println("You:        " + count);
                    count++;
                    System.out.println("You:        " + count);
                    break;
                } else if (userNumber == 3) {
                    count++;
                    System.out.println("You:        " + count);
                    count++;
                    System.out.println("You:        " + count);
                    count++;
                    System.out.println("You:        " + count);
                    break;
                } else if(userNumber < 1 || userNumber > 3){
                    System.out.println("Please enter an integer between 1 and 3.");
                    continue;
                }

            }
        }while (true);

        if (count >= maxReach) {
            System.out.println("Game is Over, you lost the game");
        } else {
            runComputer();
        }


    }



    public void explainRule(){
        System.out.println("Welcome to play our BaskinRobbins 31 game!");
        System.out.println("Rule of this game");
        System.out.println("Each player can call up to three consecutive numbers");
        System.out.println("For example: If I call 1,2,3, then, you can call 4 or 4,5 or 4,5,6");
        System.out.println("Whoever reaches the MaxNumber you set for will lose the game");
        System.out.print("This game is single player game" +
                "which means\nthere's only " );
        NumberOfUser();
        System.out.println(" player");
    }

}

