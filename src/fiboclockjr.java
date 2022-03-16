import java.util.Scanner;
import java.util.*;

public class fiboclockjr {

        public static void main (String[] args)	{


            System.out.println("Please write 5 letters");
                    Scanner input = new Scanner(System.in);

            String[] a;
            a = new String[5];
            a[0] = input.next();
            a[1] = input.next();
            a[2] = input.next();
            a[3] = input.next();
            a[4] = input.next();
            int B = 0;
            int R = 0;
            int W = 0;
            int G = 0;

            //0
            if(a[0].equals("B")){
                B += 1;
            } else if(a[0].equals("W")) {
                W += 1;
            } else if(a[0].equals("R")){
                R += 1;
            } else if(a[0].equals("G")){
                G += 1;
            }


            // 1            
            if(a[1].equals("B")){
                B += 1;
            } else if(a[1].equals("W")) {
                W += 0;
            } else if(a[1].equals("R")){
                R += 1;
            } else if(a[1].equals("G")){
                G += 1;
            }

            //2         
            if(a[2].equals("B")){
                B += 2;
            } else if(a[2].equals("W")) {
                W += 0;
            } else if(a[2].equals("R")){
                R += 2;
            } else if(a[2].equals("G")){
                G += 2;
            }
    
            //3
            if(a[3].equals("B")){
                B += 3;
            } else if(a[3].equals("W")) {
                W = 0;
            } else if(a[3].equals("R")){
                R += 3;
            } else if(a[3].equals("G")){
                G += 3;
            }


            //4
            if(a[4].equals("B")){
                B += 5;
            } else if(a[4].equals("W")) {
                W += 0;
            } else if(a[4].equals("R")){
                R += 5;
            } else if(a[4].equals("G")){
                G += 5;
            }


            int Hour = (R+B);
            int Minute = (G+B)*5;

            if( Minute>= 60){
                Minute = Minute -60;
                Hour+=1;
            }
            if(Hour>=10&&Minute>=10){
                System.out.println(Hour+":"+Minute);
            } else if(Hour>=10&&Minute<10){
                System.out.println(Hour+":"+"0"+Minute);
            }else if(Hour<=10&&Minute>10){
                System.out.println("0"+Hour+":"+Minute);
            }else if(Hour<=10&&Minute<=10){
                System.out.println("0"+Hour+":"+"0"+Minute);


            }
        }
}
