package nested.nested;

public class nestedOuterMain {

    public static void main(String[] args) {
//        NestedOuter nestedOuter = new NestedOuter(); 생략해도 중첩 클래스 단독으로 만드는 것이 가능
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nested = " + nested.getClass());
        // $로 구분
    }
}
