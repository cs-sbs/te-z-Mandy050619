import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddCount = 0;
        int evenCount = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println(oddCount + " " + evenCount);
        scanner.close();
    }
}
