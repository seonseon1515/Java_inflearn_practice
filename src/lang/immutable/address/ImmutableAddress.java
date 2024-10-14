package lang.immutable.address;

public class ImmutableAddress {
    private final String value;
    // final 없더라도 setter가 없기 때문에 값을 변경할 수 없음
    // 하지만 final을 넣어두면 의도를 명확히 할 수 있음
    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
