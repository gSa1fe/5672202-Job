public class TestClassObject {
    public static void main(String[] args) {
        //สร้าง Object นักศึกษา 3 Object
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        //กำหนดข้อมูลให้แต่ละ Object
        s1.studentId = "SE001";
        s1.name = "Somchai";
        s1.score = 85.5;

        s2.studentId = "SE002";
        s2.name = "Suda";
        s2.score = 78.0;

        s3.studentId = "SE003";
        s3.name = "Anan";
        s3.score = 92.5;

        //แสดงข้อมูลทางหน้าจอ
        System.out.println("===== Student 1 =====");
        System.out.println("Student ID : " + s1.studentId);
        System.out.println("Name       : " + s1.name);
        System.out.println("Score      : " + s1.score);
        System.out.println();

        System.out.println("===== Student 2 =====");
        System.out.println("Student ID : " + s2.studentId);
        System.out.println("Name       : " + s2.name);
        System.out.println("Score      : " + s2.score);
        System.out.println();

        System.out.println("===== Student 3 =====");
        System.out.println("Student ID : " + s3.studentId);
        System.out.println("Name       : " + s3.name);
        System.out.println("Score      : " + s3.score);
        System.out.println();

        // ทดลองเปลี่ยนค่า score ของ s1 แล้วดูว่า s2, s3 เปลี่ยนตามหรือไม่
        s1.score = 90;
        System.out.println(">>> หลังเปลี่ยน s1.score = 90 <<<");
        System.out.println("s1 -> " + s1.name + " : " + s1.score);
        System.out.println("s2 -> " + s2.name + " : " + s2.score);
        System.out.println("s3 -> " + s3.name + " : " + s3.score);
    }
}