package W13;

public class W13_03_Array_CountOddEven {

    public static void main(String[] args) {
        //ให้นับเลขคู่และเลขคี่ใน array ด้านล่าง

        int[] number = {1, 2, 11, 44, 54, 78, 10, 32, 100, 50, 94, 4, 522, 4, 22};

        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
            if (number[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;

            }
        }
        System.out.println("\nAmount of all Number : " + number.length);
        System.out.println("\nAmount of Even Number : " + countEven);
        System.out.println("\nAmount of Odd Number : " + countOdd);

    }
}
