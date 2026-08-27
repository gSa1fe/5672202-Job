package week10;

import java.util.Scanner;

public class TestOverload {

    // ส่วนที่ 1: Method Overloading สำหรับคำนวณผลรวม

    // 1.1 ผลรวมของจำนวนเต็ม 2 ตัว
    public static int sum(int a, int b) {
        return a + b;
    }

    // 1.2 ผลรวมของจำนวนเต็ม 3 ตัว
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // 1.3 ผลรวมของจำนวนจริง 2 ตัว
    public static double sum(double a, double b) {
        return a + b;
    }

    // 1.4 ผลรวมของจำนวนจริง 3 ตัว
    public static double sum(double a, double b, double c) {
        return a + b + c;
    }

    // ส่วนที่ 2: เมธอดสำหรับรับข้อมูล

    // 2.1 รับข้อมูลจำนวนเต็มจากผู้ใช้
    public static int getIntInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // 2.2 รับข้อมูลจำนวนจริงจากผู้ใช้
    public static double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // ส่วนที่ 3: เมธอดสำหรับแสดงผล

    // 3.1 แสดงผลลัพธ์การคำนวณ
    public static void displayResult(String operation, Object result) {
        System.out.println("ผลลัพธ์ของ " + operation + " = " + result);
        System.out.println("----------------------------------------");
    }

    // 3.2 แสดงหัวข้อโปรแกรม
    public static void showHeader() {
        System.out.println("========================================");
        System.out.println("   โปรแกรมทดสอบ Method Overloading");
        System.out.println("========================================");
    }

    // 3.3 แสดงสรุปการทำงาน
    public static void showSummary() {
        System.out.println("========================================");
        System.out.println("   สรุป: Method Overloading ทำงานได้ถูกต้อง");
        System.out.println("========================================");
    }

    // ส่วนที่ 4: Main Method

    public static void main(String[] args) {

        // แสดงหัวข้อโปรแกรม
        showHeader();

        // ทดสอบที่ 1: sum(int, int)
        System.out.println("\n[ทดสอบที่ 1] การเรียกใช้งาน sum(int, int)");
        int num1 = getIntInput("  ป้อนจำนวนเต็มตัวที่ 1: ");
        int num2 = getIntInput("  ป้อนจำนวนเต็มตัวที่ 2: ");
        int result1 = sum(num1, num2);
        displayResult("sum(int, int)", result1);

        // ทดสอบที่ 2: sum(int, int, int)
        System.out.println("\n[ทดสอบที่ 2] การเรียกใช้งาน sum(int, int, int)");
        int num3 = getIntInput("  ป้อนจำนวนเต็มตัวที่ 3: ");
        int result2 = sum(num1, num2, num3);
        displayResult("sum(int, int, int)", result2);

        // ทดสอบที่ 3: sum(double, double)
        System.out.println("\n[ทดสอบที่ 3] การเรียกใช้งาน sum(double, double)");
        double d1 = getDoubleInput("  ป้อนจำนวนจริงตัวที่ 1: ");
        double d2 = getDoubleInput("  ป้อนจำนวนจริงตัวที่ 2: ");
        double result3 = sum(d1, d2);
        displayResult("sum(double, double)", result3);

        // ทดสอบที่ 4: sum(double, double, double)
        System.out.println("\n[ทดสอบที่ 4] การเรียกใช้งาน sum(double, double, double)");
        double d3 = getDoubleInput("  ป้อนจำนวนจริงตัวที่ 3: ");
        double result4 = sum(d1, d2, d3);
        displayResult("sum(double, double, double)", result4);

        // แสดงสรุป
        showSummary();
    }
}