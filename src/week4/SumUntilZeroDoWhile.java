// รับตัวเลขและหาผลรวมจนกว่าจะป้อน 0 (ใช้ do-while)

import java.util.Scanner;

public class SumUntilZeroDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("ป้อนตัวเลข (ป้อน 0 เพื่อหยุด):");

        do {
            System.out.print("ตัวเลข: ");
            number = input.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("ผลรวมของตัวเลขที่ป้อนทั้งหมด = " + sum);
        input.close();
    }
}