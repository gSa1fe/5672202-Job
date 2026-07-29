import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = input.nextInt();

        // ตรวจสอบเลขคู่หรือคี่ด้วยตัวดำเนินการ Modulo %
        if (number % 2 == 0) {
            System.out.println(number + " เป็นเลขคู่");
        } else {
            System.out.println(number + " เป็นเลขคี่");
        }

        input.close();
    }
}