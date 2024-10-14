package lang.immutable.change;

import lang.immutable.address.ImmutableAddress;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue){
        int result = value + addValue;
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }

    // final 이라 setter는 못 만듦
}
