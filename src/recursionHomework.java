import java.util.Scanner;

public class recursionHomework {
    public static void main(String[] args) {

        // create a recursive method that checks if string is a palindrome
        // e.g. --> "racecar''
        //  --> true
        // kayak --> true
        // hello --> false
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();   //Input the string
        //Check whether palindrome or not
        if (recursive(str))
            System.out.println(str+" is palindrome");
        else
            System.out.println(str+ " is not a palindrome");
    }

    public static boolean recursive(String a){
        if(a.length()==0 || a.length()==1)
            return true;
        if(a.charAt(0)== a.charAt(a.length()-1))
            return recursive(a.substring(1, a.length()-1));
            return false;
    }
}
