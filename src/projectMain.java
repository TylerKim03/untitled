import java.util.Scanner;

public class projectMain {

    public static void main(String[] args) {

        String userName = "qqhqqh03";
        String passWord = "1234qwer";

        Scanner input = new Scanner(System.in);
        System.out.println("type 1 if you are admin\n2 if you are teacher\n3 if you are student");
        int typeNumber = input.nextInt();

        System.out.println("type your user name");
        String inputUserName = input.next();
        System.out.println("type your password");
        String inputPassWord = input.next();


            if((userName.equals(inputUserName)&& passWord.equals(inputPassWord))){
                System.out.println("Welcome back!");
            } else
                System.out.println("your User name or password is incorrect! try again");








    }
}
