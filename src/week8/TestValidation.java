package week8;

public class TestValidation {

    public static void main(String[] args) {

        System.out.println("=== ตัวอย่างการใช้งานพื้นฐาน ===");
        Product p = new Product();
        p.setName("โน้ตบุ๊ก");
        p.setPrice(15990.0);
        p.setQuantity(5);
        System.out.println("ชื่อสินค้า   : " + p.getName());
        System.out.println("ราคา        : " + p.getPrice());
        System.out.println("จำนวนสินค้า : " + p.getQuantity());

        System.out.println("\n=== ทดลองป้อนค่าที่ไม่ถูกต้อง ===");
        p.setPrice(-100);
        p.setQuantity(-2);
        System.out.println("ราคาหลังทดลอง (ยังคงค่าเดิม) : " + p.getPrice());
        System.out.println("จำนวนหลังทดลอง (ยังคงค่าเดิม): " + p.getQuantity());

        // ----- ทดสอบตามชุดข้อมูลในตาราง Test Case -----
        System.out.println("\n=== ทดสอบชุดข้อมูลตามตาราง Test Case ===");
        runTestCase(1, "สินค้า A", 120.50, 10);
        runTestCase(2, "สินค้า B", 0, 5);
        runTestCase(3, "สินค้า C", -50, 3);
        runTestCase(4, "สินค้า D", 200, -1);
        runTestCase(5, "สินค้า E", -10, -5);
    }

    private static void runTestCase(int no, String name, double price, int quantity) {
        System.out.println("\n--- กรณีทดสอบที่ " + no + " : price=" + price + ", quantity=" + quantity + " ---");
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);
        System.out.println("ผลลัพธ์สุดท้ายที่บันทึกจริง -> ราคา=" + product.getPrice()
                + ", จำนวน=" + product.getQuantity());
    }
}

class Product {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("ราคาสินค้าต้องมากกว่า 0");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("จำนวนสินค้าต้องไม่ติดลบ");
        }
    }
}