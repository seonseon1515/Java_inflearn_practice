package lang.wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

//    인스턴스에 소속되도록 만듦
    public int compareTo( int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "" + value;
//        String.valueOf(value);
    }
}
