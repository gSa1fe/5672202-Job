package week11;

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void showInfo() {
        System.out.println("ชื่อ: " + name + " อายุ: " + age);
    }
}

class Student extends Person {
    private String studentId;

    public void setStudentId(String id) {
        this.studentId = id;
    }

    public String getStudentId() { return studentId; }

    public void showStudentInfo() {
        showInfo(); // เรียก Method จากคลาสแม่
        System.out.println("รหัสนักศึกษา: " + studentId);
    }

    public void study() {
        System.out.println(getName() + " กำลังตั้งใจเรียนอยู่ครับ/ค่ะ");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Somchai");
        s1.setAge(20);

        s1.setStudentId("67011234");

        s1.showStudentInfo();

        s1.study();
    }
}