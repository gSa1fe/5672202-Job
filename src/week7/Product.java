public class Product {
    String name;
    double price;
    int quantity;

    //แสดงข้อมูลสินค้า (ไม่คืนค่า)
    public void showInfo() {
        System.out.println("Name     : " + name);
        System.out.printf("Price    : %.2f%n", price);
        System.out.println("Quantity : " + quantity);
    }

    // คำนวณราคารวมของสินค้า แล้วคืนค่ากลับ
    public double calculateTotal() {
        return price * quantity;
    }
}