package W13;

import java.util.Scanner;

public class W13_02_introArray {

    public static void main(String[] args) {
        // ประกาศตัวแปร array แบบที่2 โดยไม่มีข้อมูล
        String[] brandCars = new String[10];
        Scanner kb = new Scanner(System.in);

        //กำหนดค่าให้กับ array
        brandCars[0] = "Toyota";
        brandCars[1] = "Honda";
        brandCars[2] = "Nissan";

        //แสดงผลโดยใช้ loop
        System.out.print("Brand of cars in the array are:");
        for (int i = 0; i < brandCars.length; i++) {
            System.err.print(brandCars[i] + " / ");

        }
        brandCars[3] = "Mazda";
        System.err.println(" ");
        System.out.print("Old Default Brand of cars in the array are:");
        for (int i = 0; i < brandCars.length; i++) {
            System.err.print(brandCars[i] + " / ");

        }

        System.err.println("\n\nPleand enter the brand of the 3rd car:");
        for (int i = 0; i < brandCars.length; i++) {
            System.err.print("Enter brand " + (i + 1) + ": ");
            brandCars[i] = kb.next();

        }

        System.out.print("\nnewBrand of cars in the array are:");
        for (String car : brandCars) { //ใช้ for-each loop
            System.err.print(car + " / ");

        }
    }
}
