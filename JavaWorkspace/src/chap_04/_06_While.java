package chap_04;

public class _06_While {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;

        while (move < distance){
            System.out.println("이동 중");
            move += 3;

        }
        System.out.println("도착");
    }
}
