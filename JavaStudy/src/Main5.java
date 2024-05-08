import javax.swing.*;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

class ArrayEx4 {
    public static void main(String[] args) {

        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }
        int temp = 0;
        int j = 0;

        for (int i = 0; i < 100; i++) {
            j = (int) (Math.random() * 45);
//            System.out.println(j);
//            System.out.println();
            temp = ball[0];
            ball[0] = ball[j];
            ball[j] = temp;
        }
        for(int i = 0; i < 6; i++) {
            System.out.println(ball[i]+ " ");
        }
    }
}

class ArrayEx7 {
    public static void main(String[] args) {
        char[] hex = {'C', 'A', 'F', 'E'};

        String[] binary = { "0000", "0001", "0010", "0011"
                            , "0100", "0101", "0110", "0111"
                            , "1000", "1001", "1010", "1011"
                            , "1100", "1101", "1110", "1111" };

        String result = "";

        for (int i = 0; i < hex.length; i++) {
            if(hex[i] >= '0' && hex[i] <= '9') {
                result += binary[hex[i]-'0'];
            } else {
                result += binary[hex[i]-'A'+10];
            }
        }

        System.out.println("hex: " + new String(hex));
        System.out.println("binary: " + result);
    }
}

class ArrayEx13 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수: " + args.length);
        for(int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = \" " + args[i] + "\"");
        }
    }
}
