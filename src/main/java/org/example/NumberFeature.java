package org.example;

import java.util.Scanner;

public class NumberFeature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int featureValue = calculateOddEvenFeature(number);
        System.out.println(featureValue);
    }

    // 计算奇偶特征值的方法
    public static int calculateOddEvenFeature(int number) {
        int featureValue = 0; // 用于存储特征值的十进制表示
        int position = 1; // 数位，从1开始编号（个位是1号，十位是2号，以此类推）
        int binaryPlaceValue = 1; // 二进制位值，初始为2^0（即1）

        while (number > 0) {
            int digit = number % 10; // 取当前位的数字
            boolean digitIsOdd = (digit % 2 != 0); // 判断当前数字是否为奇数
            boolean positionIsOdd = (position % 2 != 0); // 判断当前数位是否为奇数

            if (digitIsOdd == positionIsOdd) { // 如果数字与数位的奇偶性相同
                featureValue += binaryPlaceValue; // 将当前的二进制位值累加到特征值中
            }

            number /= 10; // 去掉当前位的数字，准备处理下一位
            position++; // 数位加1
            binaryPlaceValue *= 2; // 二进制位值左移一位（相当于乘以2）
        }

        return featureValue;
    }
}
