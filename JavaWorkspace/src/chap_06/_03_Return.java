package chap_06;

public class _03_Return {
    public static String getPhoneNumber(){
        String phoneNumber = "010-1234-5678";
        return phoneNumber;
    }

    public static void main(String[] args) {
        getPhoneNumber();
        String phoneNumber = getPhoneNumber();
        System.out.println(phoneNumber);
    }
}
