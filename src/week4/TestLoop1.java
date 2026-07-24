// แสดงตัวเลขตั้งแต่ 1 ถึง 100 ทีละบรรทัด โดยใช้ while-loop

public class TestLoop1 {
    public static void main(String[] args) {
        int i = 1;                     // กำหนดค่าเริ่มต้น

        while (i <= 100) {             // ตรวจสอบเงื่อนไขก่อนเข้า loop
            System.out.println(i);     // แสดงค่า i
            i++;                       // ปรับค่าเพิ่มขึ้นทีละ 1
        }
    }
}