public class TestArray1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int[] score = new int[5];  // สร้าง array เก็บคะแนน 5 คน

        // รับคะแนนเข้า array
        System.out.println("กรุณาป้อนคะแนนสอบของนักศึกษา 5 คน");
        for (int i = 0; i < score.length; i++) {
            System.out.print("คนที่ " + (i + 1) + " : ");
            score[i] = sc.nextInt();
        }

        // แสดงคะแนนทั้งหมด
        System.out.print("\nคะแนนของนักศึกษาทั้งหมด คือ\n");
        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + " ");
        }
        System.out.println();

        // คำนวณผลรวม
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }

        // คำนวณค่าเฉลี่ย
        double avg = (double) sum / score.length;

        // หาค่าสูงสุด/ต่ำสุด
        int max = score[0];
        int min = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("----------------------------");
        System.out.println("ผลรวมของคะแนน   = " + sum);
        System.out.printf("ค่าเฉลี่ยของคะแนน = %.2f%n", avg);
        System.out.println("คะแนนสูงสุด      = " + max);
        System.out.println("คะแนนต่ำสุด      = " + min);

        sc.close();
    }
}