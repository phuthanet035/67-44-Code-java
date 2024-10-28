package Test_674230035;

import java.util.Scanner;

public class S674230035_02_myTest {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("กรุณาป้อนตัวเลข: ");
        int num = kb.nextInt();
        int sum = 0;
        int i = 0;

        while (i <= num) {
            sum = i + sum;
            i++;

        }
        System.out.println("ผลรวมตั้งแต่ 1 ถึง " + num + " คือ " + sum);
    }

}


