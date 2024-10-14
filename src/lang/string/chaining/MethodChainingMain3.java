package lang.string.chaining;

public class MethodChainingMain3 {
    // 실습할 때 강의의 코드를 이해해서 안 보고 쳐보기
    // 그 과정에서 이해가 안되는 부분이 나올 수 있음
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        // 참조값을 반환하는 메서드므로 반환된 참조값을 연결해서 사용하는 것
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);

    }
}
