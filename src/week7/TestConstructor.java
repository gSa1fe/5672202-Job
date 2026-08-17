public class TestConstructor {
    public static void main(String[] args) {
        //สร้าง Object หลายรายการโดยใช้ Constructor
        Employee e1 = new Employee("Somchai", "Programmer", 25000);
        Employee e2 = new Employee("Suda", "Analyst", 28000);
        Employee e3 = new Employee("Anan", "Manager", 45000);

        //แสดงข้อมูลพนักงานทั้งหมด
        System.out.println("===== Employee 1 =====");
        e1.showInfo();
        System.out.println();

        System.out.println("===== Employee 2 =====");
        e2.showInfo();
        System.out.println();

        System.out.println("===== Employee 3 =====");
        e3.showInfo();
    }
}