package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드 - 객체의 정보를 반환
        // 부모 인스턴스도 같이 생성됨
        String string = child.toString();
        System.out.println(string);

    }
}
