package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {

        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        // enum은 toString을 참조값이 아닌 상수 이름으로 오버라이딩함
        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref BASIC = " + refValue(Grade.GOLD));
        System.out.println("ref BASIC = " + refValue(Grade.DIAMOND));

    }

    private static String refValue(Object grade){
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
