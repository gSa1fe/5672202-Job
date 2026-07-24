// แสดงสูตรคูณแม่ 2 ถึง 12 โดยใช้ for-loop แบบ Nested Loop

public class TestForLoop {

    // แสดงสูตรคูณแม่ 2-12
    public static void multiplicationTable() {
        System.out.println("========== สูตรคูณแม่ 2-12 ==========");

        for (int i = 2; i <= 12; i++) {            // วนลูปแม่ (2 ถึง 12)
            System.out.println("\nแม่ " + i + " :");
            for (int j = 1; j <= 12; j++) {        // วนลูปตัวคูณ (1 ถึง 12)
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    // แสดงสามเหลี่ยมชิดซ้าย
    public static void printLeftTriangle(int rows) {
        System.out.println("\n========== สามเหลี่ยมชิดซ้าย (ขนาด " + rows + " แถว) ==========");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // แสดงพีระมิด
    public static void printPyramid(int rows) {
        System.out.println("\n========== พีระมิด (ขนาด " + rows + " แถว) ==========");
        for (int i = 1; i <= rows; i++) {
            // พิมพ์ช่องว่างด้านหน้า
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            // พิมพ์ดาว
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // ส่วนที่ 1: สูตรคูณ
        multiplicationTable();

        // ส่วนที่ 2: รูปแบบต่าง ๆ
        printLeftTriangle(5);   // ปรับขนาดได้
        printPyramid(5);        // ปรับขนาดได้

        // ทดลองปรับขนาดเป็น 8
        System.out.println("\n===== ทดลองปรับขนาดเป็น 8 แถว =====");
        printLeftTriangle(8);
        printPyramid(8);
    }
}