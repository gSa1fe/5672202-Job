import java.util.Scanner;

public class TestMenu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            // แสดงเมนู
            System.out.println("\n===== เมนูหลัก =====");
            System.out.println("1. แสดงข้อความต้อนรับ");
            System.out.println("2. ตรวจสอบเลขคู่ / เลขคี่");
            System.out.println("3. แสดงตารางสูตรคูณ");
            System.out.println("4. ออกจากโปรแกรม");
            System.out.print("เลือกตัวเลือก (1-4): ");

            choice = input.nextInt();

            // ใช้ switch-case เพื่อเลือกทำงานตามเมนู
            switch (choice) {
                case 1:
                    System.out.println("สวัสดี! ยินดีต้อนรับสู่โปรแกรมของเรา :)");
                    break;

                case 2:
                    System.out.print("กรุณากรอกจำนวนเต็ม: ");
                    int num = input.nextInt();
                    if (num % 2 == 0) {
                        System.out.println(num + " เป็นเลขคู่ (Even)");
                    } else {
                        System.out.println(num + " เป็นเลขคี่ (Odd)");
                    }
                    break;

                case 3:
                    System.out.print("กรุณากรอกแม่สูตรคูณ (1-12): ");
                    int table = input.nextInt();
                    if (table < 1 || table > 12) {
                        System.out.println("กรุณากรอกค่า 1-12 เท่านั้น");
                    } else {
                        System.out.println("ตารางสูตรคูณแม่ " + table);
                        for (int i = 1; i <= 12; i++) {
                            System.out.println(table + " x " + i + " = " + (table * i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("ขอบคุณที่ใช้โปรแกรม");
                    break;

                default:
                    System.out.println("ตัวเลือกไม่ถูกต้อง กรุณาเลือก 1-4");
                    break;
            }

        } while (choice != 4);

        input.close();
    }
}