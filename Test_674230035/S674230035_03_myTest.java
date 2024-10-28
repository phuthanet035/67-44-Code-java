package Test_674230035;

import java.util.Scanner;

public class S674230035_03_myTest {
 
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("");
        int max = 0;
        System.out.println("กรุณาใส่จำนวนเต็ม 3 ค่า: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("ค่าที่ " + (i + 1) + " ");
            int numbers = kb.nextInt();
            if (numbers > max) {
                max = numbers;
            }
        }
        System.out.println("ค่ามากสุดคือ: " + max);
    }

}



