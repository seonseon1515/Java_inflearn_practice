package enumeration.ref2;
// 임포트 주의
public class GradeEnumMain {

    public static void main(String[] args) {
     int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC,price);
        int gold = discountService.discount(Grade.GOLD,price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC의 할인 금액 = " + basic);
        System.out.println("GOLD의 할인 금액 = " + gold);
        System.out.println("DIAMOND의 할인 금액 = " + diamond);

    }
}
