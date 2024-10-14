package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        // 1. date1.getYear() ~~ 안됨
//        ImmutableMyDate newDate1 = new ImmutableMyDate(2025, 1, 1);
//        date1 = newDate1;
        date1 = date1.withYear(2025); // date1 은 새로운 참조값을 가지게 됨
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
