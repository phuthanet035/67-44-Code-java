package W12;

import java.util.Scanner;

public class W12_03_doWhile_checkGrade {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int score;

        // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้ป้อน
        // ให้ผู้ใช้ป้อนข้อมูลซ้ำจนกว่าจะถูกต้อง
        do {
            System.out.println("Enter your score between 1 and 100: ");
            score = kb.nextInt();

        } while (score < 1 || score > 100);   // ถ้าผู้ใช้ป้อนไม่ถูกต้องให้ป้อนใหม่

        // แสดงข้อมูลที่ผู้ใช้ป้อน เช่น ou entered: 75
        // ตรวจสอบเกรด
        if (score >= 90) {
            System.err.println("You grade is A");
        } else if (score >= 80) {

            System.err.println("You grade is B");

        } else if (score >= 70) {

            System.err.println("You grade is C");

        } else if (score >= 60) {

            System.err.println("You grade is D");

        } else if (score >= 50) {

            System.err.println("You grade is E");

        }

    }

}
