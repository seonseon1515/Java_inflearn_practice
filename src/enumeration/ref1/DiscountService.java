package enumeration.ref1;

import enumeration.ex3.Grade;

public class DiscountService {

    // 타입을 제대로 쓰지 않으면 사이드 이펙트 발생 가능성
    public int discount(ClassGrade grade, int price) {
        return price * grade.getDiscountPercent();
    }
}
