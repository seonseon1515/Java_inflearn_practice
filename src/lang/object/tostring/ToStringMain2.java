package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString()); // 상속받은 오브젝트의 toString의 기능 그대로
        System.out.println(dog1.toString()); // 오버라이드
        System.out.println(dog2.toString()); // 오버라이드

         System.out.println("2. println 내부에서 toString 호출 ");
        System.out.println(car.toString()); // 상속받은 오브젝트의 toString의 기능 그대로
        System.out.println(dog1.toString()); // 오버라이드
        System.out.println(dog2.toString()); // 오버라이드

        // static 이라서 바로 호출 가능
        System.out.println("3. Object 다형성 활용");
        // print 매개변수에 업캐스팅이 자동으로 되기 때문에
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        String refValue1 = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue1);

        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("refValue = " + refValue2);
    }
}
