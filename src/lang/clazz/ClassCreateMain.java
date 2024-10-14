package lang.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {
//        Class helloClass = Hello.class;
        // 예외 처리 코드 추가 단축키 alt + enter
        Class helloClass = Class.forName("lang.clazz.Hello");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
