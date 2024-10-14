package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b;        // 스트링에 대해서만 + 연산 허용
        System.out.println("result = " + result1);
        System.out.println("result = " + result2);
    }
}
