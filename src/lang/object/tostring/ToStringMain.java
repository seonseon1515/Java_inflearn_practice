package lang.object.tostring;

public class ToStringMain {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // toString() 반환값 출력
        System.out.println(string);

        // lang.object 직접 출력
        System.out.println(object);
        // 객체가 어떤 클래스로 부터 만들어졌는지에대한 정보와 참조값
    }
}
