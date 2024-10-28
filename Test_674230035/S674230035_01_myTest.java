package Test_674230035;

import java.util.Scanner;

public class S674230035_01_myTest {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("กรุณาป้อนเลข: ");
        int number = kb.nextInt();

        int result = number % 2;

        if (result == 0) {
            System.out.println(number + " เป็นเลขจำนวนเลขคู่ ");
            
        }else{
            System.out.println(number + " เป็นจำนวนเลขคี่ ");
        }
     

            }
        }



    
