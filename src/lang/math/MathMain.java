package lang.math;

public class MathMain {

    public static void main(String[] args) {
        // 기본 연산 메서드
        System.out.println("max(10,20): " + Math.max(10,20));
        System.out.println("min(10,20): " + Math.min(10,20));
        System.out.println("abs(10,20): " + Math.abs(-20));

        // 반올림 및 정밀도 메서드
        System.out.println("ceil(1.2) = " + Math.ceil(1.2)); // 올림
        System.out.println("round(1.2) = " + Math.round(1.2)); // 반올림
        System.out.println("floor(1.2) = " + Math.floor(1.2)); // 내림

        // 기타 유용한 메서드
        System.out.println("sqrt(4): " + Math.sqrt(4)); // 제곱근
        System.out.println("random(): " + Math.random()); // 0.0 ~ 1.0 사이의 double 값
    }
}
