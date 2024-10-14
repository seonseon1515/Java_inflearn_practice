package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        // 모든 ENUM 반환
        Grade[] values = Grade.values();
        // 배열의 항목을 하나하나 출력하기 위해 Arrays.toString로 감쌈
        System.out.println("values = " + Arrays.toString(values));

        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal" + value.ordinal());
        }

        // String -> ENUM 변환, 잘못된 문자면 예외 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}
