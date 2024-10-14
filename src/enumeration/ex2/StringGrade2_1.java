package enumeration.ex2;

import enumeration.ex2.DiscountService;
import enumeration.ex1.StringGrade;
// 임포트 주의
public class StringGrade2_1 {

    public static void main(String[] args) {
     int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC,price);
        int gold = discountService.discount(ClassGrade.GOLD,price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC의 할인 금액 = " + basic);
        System.out.println("GOLD의 할인 금액 = " + gold);
        System.out.println("DIAMOND의 할인 금액 = " + diamond);

    }
}
