package lang.string.test;

public class TestString8 {

    public static void main(String[] args) {
        String input = "hello java spring jpa java";

        // 불변 객체인데 값 변경이 되는 이유?
        input = input.replace("java", "jvm");

        System.out.println(input);
    }
}
