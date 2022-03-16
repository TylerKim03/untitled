public class decimalToBinary {

    public static void main(String[] args) {

    }

    public static String decimalToBinary(int i ){
        if (i/2 ==0)
            return Integer.toString(i%2);
        else
            return decimalToBinary(i/2) + 1%2;
    }
}
