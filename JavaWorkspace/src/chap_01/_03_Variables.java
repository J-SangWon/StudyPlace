package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "수령자";
        int hour = 15;

        System.out.println(name + "님 배송 시작 " + hour + "시에 도착 예정");
        System.out.println(name + "님 배송 완료");

        double score = 90.5;
        char grade = 'A';
        System.out.println(name + "의 점수는 " + score + " 점 입니다");
        System.out.println("학점은 " + grade + "입니다");

        boolean pass = true;
        System.out.println("합격? " + pass);

        double d = 3.141241445;
        float f = 3.141243356F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000000l;
        l = 1_000_000_000_000l;
        System.out.println(l);

    }
}
