package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        if (num == 0) {
            System.out.print(num);
        } else {
            while (num != 0) {
                stack.push(num % 2);
                num /= 2;
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
        }
    }
}
