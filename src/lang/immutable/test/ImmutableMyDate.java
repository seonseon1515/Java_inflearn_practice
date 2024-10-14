package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    // 불변 객체에서 새로운 것을 반환할 때는 with~를 많이 씀
    public ImmutableMyDate withYear(int newYear){
        return new ImmutableMyDate(newYear,month,day);
        // 새로운 객체로 반환
    }

    public ImmutableMyDate withMonth(int newMonth){
        return new ImmutableMyDate(year,newMonth,day);
        // 새로운 객체로 반환
    }

    public ImmutableMyDate withDay(int newDay){
        return new ImmutableMyDate(year,month,newDay);
        // 새로운 객체로 반환
    }

    public ImmutableMyDate(int year, int month, int day) {
        //this는 해당 메서드가 속해 있는 **현재 객체(instance)**를 가리킵니다.
        //this.year, this.month, this.day는 현재 인스턴스의 필드 변수
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return  year + "-" + month + "-" + day;
    }
}
