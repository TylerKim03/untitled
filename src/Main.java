import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("please write a max speed");
            int x = input.nextInt();
            System.out.println("please write a current speed of your car");
            int y = input.nextInt();
            Car c = new Car(x, y);
            c.light();
            c.maxSpeed();


        } catch(Exception e){
            System.out.println("found an Error" );
        }



    }
}
