import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // เพิ่มรายชื่อเริ่มต้น
        names.add("สมชาย");
        names.add("สายใจ");
        names.add("ปกรณ์");
        names.add("พิมพ์ชนก");

        // แสดงรายชื่อเริ่มต้น
        System.out.println("==== รายชื่อนักศึกษา (เริ่มต้น) ====");
        printNames(names);

        // เพิ่มข้อมูล
        names.add("วรพล");
        System.out.println("\n---- เพิ่มข้อมูล ----");
        System.out.println("เพิ่ม \"วรพล\" แล้ว");

        // แก้ไขข้อมูล แก้คนที่ 2 คือ index 1
        names.set(1, "สายสมร");
        System.out.println("\n---- แก้ไขข้อมูล ----");
        System.out.println("แก้ไขคนที่ 2 เป็น \"สายสมร\" แล้ว");

        // ลบข้อมูล ลบ "ปกรณ์"
        names.remove("ปกรณ์");
        System.out.println("\n---- ลบข้อมูล ----");
        System.out.println("ลบ \"ปกรณ์\" แล้ว");

        // แสดงรายชื่อหลังปรับปรุง
        System.out.println("\n==== รายชื่อนักศึกษาหลังปรับปรุง ====");
        printNames(names);

        System.out.println("\nจำนวนข้อมูลทั้งหมด = " + names.size() + " คน");
    }

    // ฟังก์ชันช่วยแสดงรายชื่อทั้งหมด
    public static void printNames(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}