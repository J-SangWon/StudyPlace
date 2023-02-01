package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
//        결과 = (조건) ? (참일 경우 값) : (거짓일 경우 값);
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max);
    }
}
