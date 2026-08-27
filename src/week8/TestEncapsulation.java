package week8;

public class TestEncapsulation {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setStudentId("670123456");
        s1.setName("Somchai");
        s1.setScore(85.5);

        System.out.println("=== ข้อมูลนักศึกษา (เข้าถึงผ่าน Getter) ===");
        System.out.println("รหัสนักศึกษา : " + s1.getStudentId());
        System.out.println("ชื่อ         : " + s1.getName());
        System.out.println("คะแนน       : " + s1.getScore());

        System.out.println("\n=== ทดลองแก้ไขคะแนนผ่าน Setter ===");
        s1.setScore(92.0);
        System.out.println("คะแนนหลังแก้ไข : " + s1.getScore());

        System.out.println("\n=== ทดลองสร้าง Object ที่ 2 ===");
        Student s2 = new Student();
        s2.setStudentId("670987654");
        s2.setName("Suda");
        s2.setScore(78.0);
        System.out.println("นักศึกษาคนที่ 1: " + s1.getStudentId() + " " + s1.getName() + " " + s1.getScore());
        System.out.println("นักศึกษาคนที่ 2: " + s2.getStudentId() + " " + s2.getName() + " " + s2.getScore());
    }
}

class Student {
    private String studentId;
    private String name;
    private double score;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}