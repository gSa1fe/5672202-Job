public class TestSearchArray {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int[] arr = {15, 22, 7, 18, 31, 40, 9, 28, 12, 5};

        // แสดงข้อมูลใน array
        System.out.print("ข้อมูลใน Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // รับค่าที่ต้องการค้นหา
        System.out.print("กรุณาป้อนตัวเลขที่ต้องการค้นหา : ");
        int searchValue = sc.nextInt();

        // ค้นหาค่าด้วย loop
        boolean found = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("พบเลข " + searchValue + " ที่ตำแหน่ง index " + index);
        } else {
            System.out.println("ไม่พบเลข " + searchValue + " ใน Array");
        }

        // นับจำนวนเลขคู่และเลขคี่
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("\nจำนวนเลขคู่ = " + countEven);
        System.out.println("จำนวนเลขคี่ = " + countOdd);

        // แสดงข้อมูลในรูปแบบตาราง
        System.out.println("\nแสดงข้อมูลในรูปแบบตาราง");
        System.out.println("Index | ค่าข้อมูล | คู่/คี่");
        System.out.println("--------------------------------");
        for (int i = 0; i < arr.length; i++) {
            String type = (arr[i] % 2 == 0) ? "คู่" : "คี่";
            System.out.println(i + "     | " + arr[i] + "        | " + type);
        }

        sc.close();
    }
}