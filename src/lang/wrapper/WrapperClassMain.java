package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {

        Integer newInteger = new Integer(10); // 미래에 삭제 예정, 대신에 valueOf() 사용
        Integer integerObj = Integer.valueOf(10);  // 미리 만들어 놓은 -128 ~ 127 자주 사용하는 숫자 값 재사용,
        // 불변, 성능이 더 최적화됨 -> 미리 생성되어 있는 객체를 반환하기 때문에 성능이 빠름

        Long LongObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
        System.out.println("newInteger = " + newInteger);
        System.out.println("newInteger = " + newInteger);
        System.out.println("LongObj = " + LongObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = LongObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObj));
        System.out.println("equals :" + (newInteger.equals(integerObj)));
    }
}
