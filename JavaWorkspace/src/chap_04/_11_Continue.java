package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        int max = 20;
        int sold = 0;
        int noShow = 17;

        for(int i = 0; i <= 50; i++){
            if(i == noShow) continue;
            System.out.println(i);

            sold++;
            if(sold == max) break;

        }
    }
}
