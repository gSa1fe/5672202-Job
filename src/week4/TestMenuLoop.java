// โปรแกรมเมนูที่มีฟังก์ชันตรวจสอบจำนวนเฉพาะและคำนวณแฟกทอเรียล
// ใช้ do-while เพื่อให้แสดงเมนูซ้ำจนกว่าผู้ใช้จะเลือกออก

import java.util.Scanner;

public class TestMenuLoop {

    // ------------------------------------------------------------
    // ฟังก์ชันตรวจสอบจำนวนเฉพาะ (Prime Number)
    // รับค่าจำนวนเต็ม n และคืนค่า true ถ้าเป็นจำนวนเฉพาะ
    // ------------------------------------------------------------
    public static boolean isPrime(int n) {
        // จำนวนที่น้อยกว่าหรือเท่ากับ 1 ไม่เป็นจำนวนเฉพาะ
        if (n <= 1) {
            return false;
        }
        // ตรวจสอบตัวหารตั้งแต่ 2 ถึงรากที่สองของ n
        // ถ้าหารลงตัว แสดงว่าไม่เป็นจำนวนเฉพาะ
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // ------------------------------------------------------------
    // ฟังก์ชันคำนวณแฟกทอเรียล (Factorial)
    // รับค่าจำนวนเต็ม n และคืนค่า n! (ผลคูณ 1*2*3*...*n)
    // ถ้า n < 0 คืนค่า -1 เพื่อแสดงข้อผิดพลาด
    // ------------------------------------------------------------
    public static long factorial(int n) {
        // จำนวนลบไม่มีแฟกทอเรียล
        if (n < 0) {
            return -1;
        }
        long result = 1;
        // ใช้ for-loop คูณตั้งแต่ 2 ถึง n
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // ฟังก์ชันหลัก (main)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;        // เก็บตัวเลือกเมนู
        int number;        // เก็บตัวเลขที่ผู้ใช้ป้อน

        System.out.println("========== ยินดีต้อนรับสู่โปรแกรม ==========");

        // ใช้ do-while เพราะต้องแสดงเมนูอย่างน้อย 1 ครั้ง
        do {
            // แสดงเมนู
            System.out.println("\n===== เมนูหลัก =====");
            System.out.println("1. ตรวจสอบจำนวนเฉพาะ");
            System.out.println("2. คำนวณแฟกทอเรียล");
            System.out.println("3. ออกจากโปรแกรม");
            System.out.print("กรุณาเลือกเมนู (1-3): ");

            choice = input.nextInt();

            // ใช้ switch-case เพื่อแยกการทำงานตามตัวเลือก
            switch (choice) {
                case 1:
                    // ตรวจสอบจำนวนเฉพาะ
                    System.out.print("ป้อนจำนวนเต็มบวกที่ต้องการตรวจสอบ: ");
                    number = input.nextInt();

                    if (isPrime(number)) {
                        System.out.println(number + " เป็นจำนวนเฉพาะ");
                    } else {
                        System.out.println(number + " ไม่เป็นจำนวนเฉพาะ");
                    }
                    break;

                case 2:
                    // คำนวณแฟกทอเรียล
                    System.out.print("ป้อนจำนวนเต็มที่ไม่ติดลบ: ");
                    number = input.nextInt();

                    long factResult = factorial(number);
                    if (factResult == -1) {
                        System.out.println("ไม่สามารถคำนวณแฟกทอเรียลของจำนวนลบได้");
                    } else {
                        System.out.println(number + "! = " + factResult);
                    }
                    break;

                case 3:
                    // ออกจากโปรแกรม
                    System.out.println("ขอบคุณที่ใช้บริการ");
                    break;

                default:
                    // ตัวเลือกไม่ถูกต้อง
                    System.out.println("กรุณาเลือก 1, 2 หรือ 3 เท่านั้น");
                    break;
            }

        } while (choice != 3);   // ทำงานซ้ำจนกว่าผู้ใช้จะเลือก 3

        input.close();   // ปิด Scanner
    }
}