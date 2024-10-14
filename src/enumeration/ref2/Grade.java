package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private int discountPercent;
    // 생성자를 통해 변수의 값이 바뀌겠지?

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
