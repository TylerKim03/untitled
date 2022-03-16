import java.util.Scanner;

public class mainFibo {

    public static void main(String[] args) {



        String[] a;
        a = new String[5];

        Scanner input = new Scanner(System.in);

        for(int i = 0; i<a.length; i++){
            System.out.println("please write the "+(1+i) +" letter");
            a[i] = input.next();
        }


        FiboClock1 F = new FiboClock1();

        if(a[0].equals("B")){
            F.blue();
        }
        if(a[0].equals("R")){
            F.red();
        }
        if(a[0].equals("G")){
            F.green();
        }
        if(a[0].equals("W")){
            F.white();
        }







    }
}
