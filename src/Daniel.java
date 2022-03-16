import java.util.Scanner;
public class Daniel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("how many subjects do you have?");
        int number = input.nextInt();
        double sum = 0;
        for (int i = 0; i < number; i++) {
            System.out.println("what is your grade?");
            double grade = input.nextInt();
            sum = sum + grade;
        }
        System.out.println("Your total grade is "+ sum );
        System.out.println("your total average grade is "+(sum/number));
        Math.random();
    }
}
