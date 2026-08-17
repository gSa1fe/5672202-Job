public class Employee {
    String name;
    String position;
    double salary;

    //Constructor สำหรับกำหนดค่าเริ่มต้นให้ Object
    public Employee(String n, String p, double s) {
        name = n;
        position = p;
        salary = s;
    }

    //แสดงข้อมูลพนักงาน
    public void showInfo() {
        System.out.println("Name     : " + name);
        System.out.println("Position : " + position);
        System.out.printf("Salary   : %.2f%n", salary);
    }
}