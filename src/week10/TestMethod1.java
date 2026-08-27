package week10;

public class TestMethod1 {

    // 1. Method สำหรับพื้นที่สี่เหลี่ยมผืนผ้า
    public static double areaRectangle(double width, double height) {
        return width * height;
    }

    // 2. Method สำหรับพื้นที่วงกลม
    public static double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // 3. Method สำหรับพื้นที่สามเหลี่ยม
    public static double areaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // 4. Method แสดงข้อความ
    public static void showMessage(String message) {
        System.out.println("ข้อความ: " + message);
    }

    // 5. Main method
    public static void main(String[] args) {

        // ทดสอบเรียกใช้ method
        double rectArea = areaRectangle(5.0, 10.0);
        System.out.println("พื้นที่สี่เหลี่ยมผืนผ้า (กว้าง 5 สูง 10): " + rectArea);

        double circleArea = areaCircle(7.0);
        System.out.println("พื้นที่วงกลม (รัศมี 7): " + circleArea);

        double triArea = areaTriangle(8.0, 6.0);
        System.out.println("พื้นที่สามเหลี่ยม (ฐาน 8 สูง 6): " + triArea);

        showMessage("สวัสดีครับ!");
        showMessage("Java Methods ทำงานได้ดี");
    }
}