package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교 : " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " +isSame(str3, str4));
    }
    // 메서드를 만든 개발자 입장에서는 어떻게 str변수들이 만들어졌는지 모름
    private static boolean isSame(String x, String y){
    //        return x==y;
        return x.equals(y);
    }
}
