package enumeration.ex1;

public class DiscountService {

    // 타입을 제대로 쓰지 않으면 사이드 이펙트 발생 가능성
    public int discount(String grade, int price) {
        int discountPercent = 0;

        // static 변수니까 접근 가능
        if(grade.equals(StringGrade.BASIC)){
            discountPercent = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPercent =20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(grade + "할인 X");
        }

        return price * discountPercent/100;
    }
}
