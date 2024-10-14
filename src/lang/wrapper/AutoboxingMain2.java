package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        // Primitive => wrapper
        int value = 7;
        Integer boxedValue = value; // auto-boxing

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // zuto-unboxing

        System.out.println(boxedValue);
        System.out.println(unboxedValue);
    }

}
