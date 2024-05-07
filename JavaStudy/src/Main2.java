import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Heello!");

    }
}


class VarEx1 {
    public static void main(String[] args) {
        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);
    }
}

class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("X:" + x + " y:" + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("X:" + x + " y:" + y);
    }
}

class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두자리 정수를 하나 입력해주세요. > ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용: " + input);
        System.out.printf("num=%d\n", num);
    }
}

class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int) ch;

        System.out.printf("%c=%d(%#X)%n", ch, code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
    }
}
