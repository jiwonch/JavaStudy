import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

    }
}

class FlowEx17 {
    public static void main(String[] args) {
        int num = 0;

        System.out.print("*을 출력할 라인의 수를 입력하세요. >");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class FlowEx20 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.printf("[%d, %d]", i, j);
            }
            System.out.println();
        }
    }
}

class FlowEx21 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i == j) {
                    System.out.printf("[%d, %d]", i, j);
                } else {
                    System.out.printf("%5c", ' ');
                }
            }
            System.out.println();
        }
    }
}

class FlowEx22 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
            System.out.printf("%d ", arr[i]);
        System.out.println();

        for (int tmp : arr) {
            System.out.printf("%d ", tmp);
            sum += tmp;
        }
        System.out.println();
        System.out.println("sum = " + sum);
    }
}