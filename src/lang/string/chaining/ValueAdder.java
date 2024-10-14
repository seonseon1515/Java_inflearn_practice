package lang.string.chaining;

public class ValueAdder {

    private int value;

    public ValueAdder add(int addValue){
        value += addValue;
        return this; // 나 자신을 반환
    }

    public int getValue(){
        return value;
    }
}
