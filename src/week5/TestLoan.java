import java.util.Scanner;

public class TestLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับข้อมูลจากผู้ใช้
        System.out.print("กรุณากรอกอายุ (ปี): ");
        int age = input.nextInt();

        System.out.print("กรุณากรอกรายได้ต่อเดือน (บาท): ");
        double income = input.nextDouble();

        // ตรวจสอบข้อมูลไม่ถูกต้อง (ค่าติดลบ)
        if (age < 0 || income < 0) {
            System.out.println("ข้อมูลไม่ถูกต้อง (อายุหรือรายได้เป็นค่าติดลบ)");
        }
        else {
            // ตรวจสอบเงื่อนไขการอนุมัติ
            if (age >= 20 && age <= 60) {
                // อายุอยู่ในเกณฑ์
                if (income >= 30000) {
                    System.out.println("มีรายได้เพียงพอและอยู่ในช่วงอายุที่เหมาะสม --> อนุมัติเงินกู้");
                }
                else if (income >= 15000) {
                    System.out.println("มีรายได้พอใช้ แต่ยังไม่ถึงเกณฑ์ที่กำหนด --> อนุมัติแบบมีเงื่อนไข");
                }
                else {
                    System.out.println("รายได้ไม่เพียงพอ --> ไม่อนุมัติ (รายได้ไม่ถึงเกณฑ์)");
                }
            }
            else {
                // อายุไม่เข้าเกณฑ์ (น้อยกว่า 20 หรือ มากกว่า 60)
                System.out.println("อายุไม่อยู่ในช่วงที่กำหนด --> ไม่อนุมัติ (อายุไม่เข้าเกณฑ์)");
            }
        }

        input.close();
    }
}