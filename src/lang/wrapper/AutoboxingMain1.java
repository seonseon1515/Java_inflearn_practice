package lang.wrapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {
        // Primitive => wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        // Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println(boxedValue);
        System.out.println(unboxedValue);
    }

}
