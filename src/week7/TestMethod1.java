public class TestMethod1 {
    public static void main(String[] args) {
        //สร้าง Object หลายรายการ
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        //กำหนดค่าให้แต่ละ Object
        p1.name = "Notebook";
        p1.price = 15000.00;
        p1.quantity = 2;

        p2.name = "Mouse";
        p2.price = 350.00;
        p2.quantity = 5;

        p3.name = "Keyboard";
        p3.price = 1200.00;
        p3.quantity = 3;

        //เรียกใช้งาน Methods และแสดงผลทางหน้าจอ
        System.out.println("=== Product 1 ===");
        p1.showInfo();
        double total1 = p1.calculateTotal();
        System.out.printf("Total    : %.2f%n%n", total1);

        System.out.println("=== Product 2 ===");
        p2.showInfo();
        double total2 = p2.calculateTotal();
        System.out.printf("Total    : %.2f%n%n", total2);

        System.out.println("=== Product 3 ===");
        p3.showInfo();
        double total3 = p3.calculateTotal();
        System.out.printf("Total    : %.2f%n", total3);
    }
}