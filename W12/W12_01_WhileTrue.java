package W12;

public class W12_01_WhileTrue {

    public static void main(String[] args) {

        int i = 0;              // กำหนดค่าเริ่มต้น
        while (true) {

            i++;
            System.out.println(i + " ");

            //if (i >= 1000) {
            //  break;
            // }
            if (i >= 1000) {
                break;
            }
        }                        // วนลูปไปเรื่อยๆ  ใช้ while (true) {
        // update รอบ
        // แสดงข้อความพร้อมกับค่า count
        // ตรวจสอบเงื่อนไข ถ้ารอบมากกว่าหรือเท่ากับ 1000 ให้ออกจากลูป
        // ออกจากลูป
    }
}
