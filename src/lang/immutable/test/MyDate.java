package lang.immutable.test;

public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        //this는 해당 메서드가 속해 있는 **현재 객체(instance)**를 가리킵니다.
        //this.year, this.month, this.day는 현재 인스턴스의 필드 변수
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return  year + "-" + month + "-" + day;
    }
}
