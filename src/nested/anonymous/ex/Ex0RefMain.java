package nested.anonymous.ex;

// 리팩토링 후
public class Ex0RefMain {

    // 여기서 꼭 중첩 정적 클래스를 만들어야만 했나? 이번 챕터 강의에서 배웠기 때문에 그냥 만들었는데.
    // 왜 아래의 클래스에 static 을 붙여야 작동되는지
    static class Hello {
        // 생성자를 만들면 프로그램을 실행할 때 더 번거로워질까? ㄴㄴ
        // private 로 적으면 좋은 점 명확히 알기
        private String char1;

        public Hello(String char1) {
            this.char1 = char1;
        }

        // 변하지 않는 부분과 변하는 부분을 분리 하기
        // 인스턴스의 참조값에 접근해야 되는데 메서드가 static영역에 있으면 메모리 구조 상 접근 불가
        private void helloChar(){
            System.out.println("프로그램 시작");      // 변하지 않는 부분
            System.out.println("Hello" + " " + this.char1);       // 변하는 부분
            System.out.println("프로그램 종료");      // 변하지 않는 부분
        }
    }

    public static void main(String[] args) {
        // 생성자를 만드는 코드를 만듦으로 인해 메모리를 더 차지하는 문제가 생기는 것 아닐까?
        Hello hello1 = new Hello("Java");
        Hello hello2 = new Hello("Spring");

    }

}
