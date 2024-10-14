package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        // 인스턴스 생성할 때 단축키(introduce Variable) ctrl + alt + V
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); // Object도 인스턴스를 만들 수 있음

        // 부모, 자식 혹은 객체의 타입 상관 없이 모든 객체를 담을 수 있는 배열인 것 같음
        Object[] objects = {dog, car, object};
        //        Object[] objects = new Object[3];
//        objects[0] = dog;
//        objects[1] = car;
//        objects[2] = lang.object;
        // create method => alt + enter
        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }
}
