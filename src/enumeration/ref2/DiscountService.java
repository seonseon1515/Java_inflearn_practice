package enumeration.ref2;

public class DiscountService {

    // 타입을 제대로 쓰지 않으면 사이드 이펙트 발생 가능성
    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent()/100;
    }
}
