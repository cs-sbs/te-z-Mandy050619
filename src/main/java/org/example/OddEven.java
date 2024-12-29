package org.example;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddCount = 0; // 奇数计数器
        int evenCount = 0; // 偶数计数器

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break; // 输入-1表示结束
            }
            if (number % 2 == 0) {
                evenCount++; // 偶数计数器加1
            } else {
                oddCount++; // 奇数计数器加1
            }
        }
        scanner.close();

        // 输出结果
        System.out.println(oddCount + " " + evenCount);
    }
}
