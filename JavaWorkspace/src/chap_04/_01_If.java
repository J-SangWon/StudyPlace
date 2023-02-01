package chap_04;

public class _01_If {
    public static void main(String[] args) {
        int hour = 15;
        if (hour < 14) {
            System.out.println("1");
            System.out.println("2");
        }
        System.out.println("x");

        hour = 10;
        boolean eat = false;
        if(hour<14 && eat == false){
            System.out.println("eat + 1");
        }
        //이하 생략

    }
}
