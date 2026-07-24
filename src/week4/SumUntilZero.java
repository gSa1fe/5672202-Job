// รับตัวเลขจากผู้ใช้และคำนวณผลรวม จนกว่าจะป้อน 0 (ใช้ while)

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = -1;   // กำหนดค่าเริ่มต้นเพื่อให้เข้าลูป

        System.out.println("ป้อนตัวเลข (ป้อน 0 เพื่อหยุด):");

        while (number != 0) {
            System.out.print("ตัวเลข: ");
            number = input.nextInt();
            sum += number;          // บวกเลขที่ป้อนเข้าไป (ถ้าเป็น 0 ก็บวก 0)
        }

        System.out.println("ผลรวมของตัวเลขที่ป้อนทั้งหมด = " + sum);
        input.close();
    }
}