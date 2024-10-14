package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20); // 반환값을 꼭 반환 타입에 맞게 꼭 받아야 함.

        // 계산 이후에도 기존 값과 신규 값 모두 확인 가능
        System.out.println("obj1 = " + obj1.getValue());

    }
}
