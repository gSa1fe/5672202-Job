import java.util.Scanner;

public class TestConditionl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("กรุณากรอกคะแนนสอบ (0-100): ");
        int score = input.nextInt();

        // ตรวจสอบความถูกต้องของคะแนน
        if (score < 0 || score > 100) {
            System.out.println("คะแนนไม่ถูกต้อง กรุณากรอกค่าในช่วง 0-100");
        } else {
            char grade;

            // ตรวจสอบเกรดตามช่วงคะแนน
            if (score >= 80) {
                grade = 'A';
            } else if (score >= 70) {
                grade = 'B';
            } else if (score >= 60) {
                grade = 'C';
            } else if (score >= 50) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("คะแนน: " + score + " ได้เกรด: " + grade);
        }

        input.close();
    }
}