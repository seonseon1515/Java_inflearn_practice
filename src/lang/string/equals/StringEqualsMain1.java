package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        // 동일성 비교
        System.out.println("new String() == 비교" + (str1 == str2)); // 참조값을 비교
        // 동등성 비교
        System.out.println("new String() equals 비교" + (str1.equals(str2)));  // 값을 비교


        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: "+ (str3 = str4));
        System.out.println("리터럴 equals 비교: "+ (str3.equals(str4)));
    }
}
