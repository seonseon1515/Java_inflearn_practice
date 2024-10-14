package lang.string.chaining;

public class MethodChainingMain2 {
    // 실습할 때 강의의 코드를 이해해서 안 보고 쳐보기
    // 그 과정에서 이해가 안되는 부분이 나올 수 있음
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        // 초기화된 변수만 사용할 수 있음
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder.getValue();
        System.out.println("result = " + result);

        System.out.println("adder1 = " + adder1);
        System.out.println("adder2 = " + adder2);
        System.out.println("adder3 = " + adder3);

    }
}
