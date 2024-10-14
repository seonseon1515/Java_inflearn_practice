package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

//        Object o = new Dog(); 오브젝트 타입은 모든 클래스의 최상위
//        toString 등 Object 메서드를 오버라이딩해서 사용하면 어떻게 될까?

        action(dog);
        action(car);
    }


    private static void action(Object obj){
//        obj.sound(); 컴파일 오류 , Object는 sound()가 없다. Object는 자기 자신 밖에 모름
//        obj.move();

//        객체에 맞는 다운 캐스팅 필요
        if(obj instanceof Dog dog){
            // 자동으로 다운 캐스팅
            dog.sound();
        } else if (obj instanceof Car car){
            car.move();
        }
        }
    }

