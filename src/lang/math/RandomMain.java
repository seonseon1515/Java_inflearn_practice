package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random(1); // seed가 같으면 여러번 시행해도 랜덤의 결과가 같음

        int RandomInt = random.nextInt();
        System.out.println("RandomInt = " + RandomInt);

        double randomDouble = random.nextDouble();// 0.0d ~ 1.0d
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10);
        System.out.println("0~9: " + randomRange1);

        int randomRange2 = random.nextInt(10) +1; // 1~10 까지 출력
        System.out.println("1~10: " + randomRange2);
    }
}
