package enumeration.ex1;

import enumeration.ex1.DiscountService;

public class StringGradeEx1_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        // 오타
        int diamomd = discountService.discount("DIAMONDD",price);
        // 소문자 입력
        int gold1 = discountService.discount("gold", price);

        int basic = discountService.discount(StringGrade.BASIC,price);
        int gold = discountService.discount(StringGrade.GOLD,price);
        int diamomd1 = discountService.discount(StringGrade.DIAMOND,price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamomd = " + diamomd);


    }
}
