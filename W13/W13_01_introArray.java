package W13;

public class W13_01_introArray {

    public static void main(String[] args) {

        // ประกาศตัวแปรชนิด Array แบบที่1-รู้จำนวนล่วงหน้า
        String[] colors = {"Purple", "Cyan", "Blue", "Green", "Yellow", "Orange", "Red"};
        int[] banks = {20, 50, 100, 500, 1000};
        char[] alpphabet = {'A', 'B', 'C', 'D', 'E'};

        // แสดงผลลัพธ์โดยใช้ indet ของ array
        System.out.println("The first color is " + colors[0]);
        System.out.println(" The third aipphabet is  " + alpphabet[2]);

        // แสดงผลโดยใช้ loop
        System.out.print("Colors in the array are:");
        for (int i = 0; i < 7; i++) {

            System.out.print(colors[i] + " ");

        }
        System.out.println(" ");

        for (int i = 6; i >= 0; i--) {

            System.out.print(colors[i] + " ");

        }
        System.err.println(" ");
        System.out.print("Banks in the array are:");
        for (int i = 0; i < banks.length; i++) { // ใช้ .length ในการหาขนาดของ array

            System.out.print(banks[i] + " ");

        }
    }
}
