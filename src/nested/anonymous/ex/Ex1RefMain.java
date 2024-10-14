package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain {

    public void helloMain(Process process){
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");
    }
    // 메모리 구조 상 같은 영역에 있는 클래스를 main 에서 사용할 수 있는 건가?
    static class HelloDice implements Process {
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("randomValue = " + randomValue);
        }
    }

    static class HelloSum implements Process {
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Ex1RefMain main = new Ex1RefMain();
        main.helloMain(new HelloDice());
        main.helloMain(new HelloSum());
        //  왜 클래스 명 옆에 생성자 없는 것 까지 표시해서 매개 변수에 넣기
    }
}


