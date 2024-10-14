package enumeration.ex3;



public class DiscountService {

    // 타입을 제대로 쓰지 않으면 사이드 이펙트 발생 가능성
    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        // static 변수니까 접근 가능
        // 참조값이 등급마다 서로 다른 것을 기반으로
        if(grade == grade.BASIC){
            discountPercent = 10;
        } else if (grade == grade.GOLD) {
            discountPercent =20;
        } else if (grade == grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println(grade + "할인 X");
        }

        return price * discountPercent/100;
    }
}
